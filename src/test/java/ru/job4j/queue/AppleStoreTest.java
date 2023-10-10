package ru.job4j.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.*;

public class AppleStoreTest {
    @Test
    public void whenGetLast() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 4500));
        customers.add(new Customer("Andrey", 4546));
        customers.add(new Customer("Alexey", 4800));
        customers.add(new Customer("Iryna", 1230));
        customers.add(new Customer("Elena", 1480));
        customers.add(new Customer("Pavel", 1980));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getLastHappyCustomer();
        assertThat(customer).isEqualTo("Alexey");
    }

    @Test
    public void whenGetFirst() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 4500));
        customers.add(new Customer("Andrey", 4546));
        customers.add(new Customer("Alexey", 4800));
        customers.add(new Customer("Iryna", 1230));
        customers.add(new Customer("Elena", 1480));
        customers.add(new Customer("Pavel", 1980));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getFirstUpsetCustomer();
        assertThat(customer).isEqualTo("Iryna");
    }
}