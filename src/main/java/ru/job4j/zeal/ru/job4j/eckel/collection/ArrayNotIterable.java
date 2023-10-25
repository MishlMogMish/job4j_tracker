package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.Arrays;

public class ArrayNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        test(Arrays.asList(strings));
        /**
         * test(strings);
         *
         * required: java.lang.Iterable<T>
         * found:    java.lang.String[]
         * reason: cannot infer type-variable(s) T
         * (argument mismatch; java.lang.String[] cannot be converted to java.lang.Iterable<T>)
         */
    }
}
