package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );
        for (Integer i : collection) {
            System.out.print(i + ", ");
        }
        System.out.println();

        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        for (Integer i : collection) {
            System.out.print(i + ",, ");
        }
        System.out.println();

        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        for (Integer i : collection) {
            System.out.print(i + ",,, ");
        }
        System.out.println();

        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        Integer[] newMore = {777, 999};
        Collection<Integer> newCollection = new ArrayList<>(Arrays.asList(newMore));
        Collections.addAll(collection, list.toArray(newMore));
        /**
         *  list.add(21);{UnsupportedOperationException} runTime
         */
        for (Integer i : collection) {
            System.out.print(i + ",,,,, ");
        }
        System.out.println();

        for (Integer i : newCollection) {
            System.out.print(i + "! ");
        }
    }
}
