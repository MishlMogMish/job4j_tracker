package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForInCollection {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for (String s : cs) {
            System.out.print("'" + s + "' ");
        }
    }
}
