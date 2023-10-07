package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] arrOfInt : list) {
            for (int i : arrOfInt) {
                rsl.add(i);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<int[]> list = List.of(new int[]{1, 2, 3},
                new int[]{4, 5}, new int[]{6, 7, 8});
        List<Integer> result = ConvertList.convert(list);
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }
}
