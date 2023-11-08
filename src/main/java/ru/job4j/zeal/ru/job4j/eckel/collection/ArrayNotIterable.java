package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        System.out.println();
        List<Double> list = Arrays.asList(1D, 2D, 3D, 4D, 5D);
        List<Double> list3 = new ArrayList<>(list);
        list3.add(6D);
        for (Double d :list3) {
            System.out.print(d + " ,  ");
        }
        System.out.println();

        list.replaceAll(n  ->  Math.sqrt(n));
        System.out.println();
        for (Double d : list) {
            System.out.print(d + " ,  ");
        }
        System.out.println();
        List<Double> sublist = list.subList(1, 3);
        for (Double d :sublist) {
            System.out.print(d + "  , ");
        }
        System.out.println();
        Collections.shuffle(sublist);
        for (Double d :sublist) {
            System.out.print(d + "  , ");
        }
        System.out.println();
        for (Double d :list) {
            System.out.print(d + "  , ");
        }
    }
}
