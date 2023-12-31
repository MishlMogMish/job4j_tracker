package ru.job4j.zeal.ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println();
        Collections.sort(list);
        System.out.println(list);

        Integer first  = 1;
        Integer second  = 2;
        int rsl = first.compareTo(second);
        System.out.println(rsl);

        String petr = "Petr";
        String ivan = "Ivan";
        rsl = petr.compareTo(ivan);
        System.out.println(rsl);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
