package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.HashSet;
import java.util.Set;

public class SetOfStrings {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Red");
            colors.add("Orange");
            colors.add("Yellow");
            colors.add("Purple");
        }
        System.out.print(colors + " , ");
    }

}
