package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Определяет класс для работы с моделями банковских счетов Account и
 * моделями клиентов банка User
 * @author Mik
 * @version 1.0
 */
public class BankService {
    /**
     * База данных всех клиентов банка User со списками их счетов Account в виде ассоциированного массива.
     * Ключами являются объекты клиентов банка User.
     * У каждого клиента может быть несколько счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавления нового клиента, при условии, что его нет в базе данных.
     * Если клиент уже есть в базе данных, то изменения в базе данных не происходит
     * @param user объект клиента User для добавления в базу
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляющий клиента из базы данных по паспорту если он есть в базе данных.
     * Если клиента в базе данных нет, то запрос на удаление не производит никаких изменений
     * @param passport паспорт удаляемого клиента
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод для добавления счета, для клиентов, уже введенных в базу,
     * Если клиента нет в базе, то никаких изменений не происходит,
     * Если клиенту добавляемый клиенту счет уже присутствует в базе данных, то никаких изменений не происходит
     * @param passport паспорт клиента, присутствующего в базе данных
     * @param account добавляемый счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод, возвращающий объект клиента User по запросу по паспорту.
     * Если клиент с таким паспортом в базе не обнаружен, никаких изменений не происходит.
     * @param passport паспорт для поиска по нему клиента User из базы данных.
     * @return возвращается клиент User при условии, что он присутствует в базе данных.
     * Если клиент в базе данных не найден, возвращается null.
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод для поиска и возвращения счета Account по реквизитам.
     * При отсутствии в базе данных клиента с таким паспортом или при отсутствии в базе
     * вводимых реквизитов возвращается null.
     * @param passport паспорт клиента, чьи реквизиты запрашиваются
     * @param requisite запрашиваемые реквизиты счета Account
     * @return при наличии в базе данных возвращается счет Account открытый на данного клиента и содержащий запрашиваемые
     * реквизиты
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (accounts != null) {
                for (Account account : accounts) {
                    if (account.getRequisite().equals(requisite)) {
                        rsl = account;
                        break;
                    }
                }
            }
        }
        return rsl;
    }

    /**
     * Метод для перевода денег между внутренними счетами банка.
     * @param srcPassport паспорт отправителя перевода
     * @param srcRequisite реквизиты отправителя
     * @param destPassport паспорт получателя перевода
     * @param destRequisite реквизиты получателя
     * @param amount переводимая сумма
     * @return если паспорта отправителя и получателя перевода присутствуют в базе данных и если у них открыты
     * запрашиваемые счета в банке, а также если на счету отправителя есть достаточно средств для
     * осуществления перевода, то деньги переводятся по указанным реквизитам и возвращается true,
     * в противном случае возвращается false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if ((srcAccount != null) && (destAccount != null) && (srcAccount.getBalance() >= amount)) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод возвращает список счетов Account клиента User.
     * При отсутствии запрашиваемых клиентов в базе данных или при отсутствии счетов у клиентов
     * из базы возвращается null
     * @param user клиент User для которого запрашивается список его счетов из базы данных
     * @return возвращается список счетов типа Account. При отсутствии счетов у клиентов или при отсутствии
     * клиентов в базе возвращается null.
     */
    public List<Account> getAccount(User user) {
        return users.get(user);
    }
}
