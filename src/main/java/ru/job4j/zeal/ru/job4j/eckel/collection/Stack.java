package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack<T> {
    private Deque<T> storage = new ArrayDeque<>();

    public void push(T value) {
        storage.push(value);
    }

    public T peek() {
        return storage.peek();
    }

    public T pop() {
       return storage.pop();
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
