package ru.job4j.zeal.ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(-5);
        numbers.add(100);
        System.out.println(numbers);

        Set<Integer> numbers1 = new TreeSet<>(Collections.reverseOrder());
        numbers1.addAll(numbers);
        System.out.println(numbers1);
    }
}
