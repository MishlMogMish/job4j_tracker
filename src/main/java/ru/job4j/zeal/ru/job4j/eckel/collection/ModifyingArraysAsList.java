package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.*;

public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(ia));
        System.out.println("Before shuffling: " + list1);
        MultiIterableClass.printInfo(ia);
        Collections.shuffle(list1, rand);
        System.out.println("After shuffling: " + list1);
        MultiIterableClass.printInfo(ia);
        System.out.println("array: " + Arrays.toString(ia));
        System.out.println();

        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("Before shuffling: " + list2);
        MultiIterableClass.printInfo(ia);
        Collections.shuffle(list2, rand);
        System.out.println("After shuffling: " + list2);
        MultiIterableClass.printInfo(ia);
        System.out.println("array: " + Arrays.toString(ia));
    }
}
