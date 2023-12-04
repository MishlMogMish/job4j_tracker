package ru.job4j.zeal.ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> rsl = strings
                .stream()
                .skip(2)
                .toList();
        System.out.println(rsl);
        System.out.println();

        List<String> rsl1 = strings
                .stream()
                .limit(3)
                .toList();
        System.out.println(rsl1);
        System.out.println();

        List<String> rsl2 = strings
                .stream()
                .skip(2)
                .limit(2)
                .toList();
        System.out.println(rsl2);
        System.out.println();

        String rsl3 = strings
                .stream()
                .skip(9)
                .limit(2)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(rsl3);
        System.out.println();

        String rsl4 = strings
                .stream()
                .skip(strings.size() - 1)
                .limit(2)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(rsl4);
    }
}
