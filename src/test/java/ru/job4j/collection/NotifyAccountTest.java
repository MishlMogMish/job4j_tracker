package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class NotifyAccountTest {
    @Test
    public void whenAddTwoDifferentAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "jhkhg"),
                new Account("143", "Petr Arsentev", "jhkhg")
        );
        HashSet<Account> expect = new HashSet<>();
        expect.add(new Account("123", "Petr Arsentev", "jhkhg"));
        expect.add(new Account("143", "Petr Arsentev", "jhkhg"));
        assertThat(NotifyAccount.sent(accounts)).containsAll(expect);
    }

    @Test
    public void whenAddTwoDuplicateAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "jhkhg"),
                new Account("143", "Petr Petrov", "jhkjbhg")
        );
        HashSet<Account> expect = new HashSet<>();
        expect.add(new Account("123", "Petr Arsentev", "jhkhg"));
        assertThat(NotifyAccount.sent(accounts)).containsAll(expect);
    }

    @Test
    public void whenAddSeveralDuplicateAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "jh4khg"),
                new Account("123", "Ivan Arsentev", "jhk3hg"),
                new Account("143", "Petr Pushkin", "jhkh23g"),
                new Account("123", "Ivan Arsentev", "jhk3hg"),
                new Account("143", "Stepan Arsentev", "jhkh45g")
        );
        HashSet<Account> expect = new HashSet<>();
        expect.add(new Account("123", "Petr Arsentev", "jhkhg"));
        expect.add(new Account("143", "Petr Pushkin", "jhkh23g"));
        assertThat(NotifyAccount.sent(accounts)).containsAll(expect);
    }
}