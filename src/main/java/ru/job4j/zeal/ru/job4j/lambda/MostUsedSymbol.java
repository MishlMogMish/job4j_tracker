package ru.job4j.zeal.ru.job4j.lambda;

import java.util.*;

public class MostUsedSymbol {
    public static void main(String[] args) {
        String input = "Slogan of Java language: write once, run everywhere"
                .toLowerCase().replaceAll(" ", "");
        Map<Character, Integer> map = new HashMap<>();
        for (char character : input.toCharArray()) {
            map.merge(character, 1, Integer::sum);
        }
        map.forEach((c, i) -> System.out.println(c + " frequency: " + i));
        TreeSet<Map.Entry<Character, Integer>> treeSet = new TreeSet<>((o1, o2) -> {
            int rsl = Integer.compare(o2.getValue(), o1.getValue());
            return rsl != 0 ? rsl : o1.getKey().compareTo(o2.getKey());
        });
        treeSet.addAll(map.entrySet());
        treeSet.removeIf(o -> o.getKey() < 'a');
        System.out.println();
        treeSet.forEach(System.out::println);
    }
}
