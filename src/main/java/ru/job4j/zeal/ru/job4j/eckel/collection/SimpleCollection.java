package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            /**
             * autoboxing
             */
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }

    }
}
