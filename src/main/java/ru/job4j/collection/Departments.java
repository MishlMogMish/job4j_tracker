package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += el;
                tmp.add(start);
                start += "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(null);
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SK2", "K1/SK1/SSK2", "K2",
                "K2/SK1/SSK2", "K2", "K2/SK1/SSK1", "K2/SK1/SSK2");
        List<String> newList = Departments.fillGaps(list);
        for (String string : newList) {
            System.out.println(string);
        }
        System.out.println();
        sortAsc(list);
        System.out.println(list);
        System.out.println();
        sortDesc(list);
        System.out.println(list);
    }
}
