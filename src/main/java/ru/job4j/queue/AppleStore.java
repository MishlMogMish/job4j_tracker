package ru.job4j.queue;

import java.util.LinkedList;
import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Queue<Customer> tempQueue = new LinkedList<>(queue);
        for (int i = 1; i < count; i++) {
            tempQueue.poll();
        }
        return tempQueue.poll().name();
    }

    public String getFirstUpsetCustomer() {
        Queue<Customer> tempQueue = new LinkedList<>(queue);
        for (int i = 1; i <= count; i++) {
            tempQueue.poll();
        }
        return tempQueue.poll().name();
    }
}
