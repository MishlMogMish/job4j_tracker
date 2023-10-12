package ru.job4j.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434")).isEqualTo(user);
    }

    @Test
    public void deleteUserIsTrue() {
        User user = new User("3434", "Petr");
        User user1 = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addUser(user1);
        bank.deleteUser("3434");
        assertThat(bank.findByPassport("3434")).isNull();
    }

    @Test
    public void deleteUserIsFalse() {
        User user = new User("3434", "Petr");
        User user1 = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addUser(user1);
        bank.deleteUser("343344");
        assertThat(bank.findByPassport("3434")).isEqualTo(user);
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("34", "5546")).isNull();
    }

    @Test
    public void whenAddAccount() {
        User user = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").getBalance()).isEqualTo(150D);
    }

    @Test
    public void when2TimesAddToTheSameAccount() {
        User user = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("5546", 650D));
        assertThat(bank.getAccount(user).size()).isEqualTo(1);
        assertThat(bank.findByRequisite("3434", "5546").getBalance()).isEqualTo(150D);
    }

    @Test
    public void whenTransferMoneyOk() {
        User user = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        boolean result = bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 120D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance()).isEqualTo(170D);
        assertThat(bank.findByRequisite(user.getPassport(), "5546").getBalance()).isEqualTo(30D);
        assertThat(result).isTrue();
    }

    @Test
    public void whenSourceBecomesZeroTransferMoneyOk() {
        User user = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        boolean result = bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "5546").getBalance()).isEqualTo(0D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance()).isEqualTo(200D);
        assertThat(result).isTrue();
    }

    @Test
    public void whenSourceHaveNotEnoughTransferMoneyNotOk() {
        User user = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 20D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        boolean result = bank.transferMoney(user.getPassport(), "5546",
                user.getPassport(), "113", 100D);
        assertThat(bank.findByRequisite(user.getPassport(), "5546").getBalance()).isEqualTo(20D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance()).isEqualTo(50D);
        assertThat(result).isFalse();
    }

    @Test
    public void whenTransferMoneyDestinationIsNull() {
        User user = new User("3434", "Petr");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 120D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        boolean result = bank.transferMoney(user.getPassport(), "5546",
                user.getPassport(), "1113", 100D);
        assertThat(bank.findByRequisite(user.getPassport(), "5546").getBalance()).isEqualTo(120D);
        assertThat(result).isFalse();
    }
}