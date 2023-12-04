package ru.job4j.zeal.ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        boolean rsl = strings.stream()
                .noneMatch("Шесть"::contains);
        System.out.println(rsl);
        System.out.println();

        boolean rsl1 = strings
                .stream()
                .anyMatch(s -> s.endsWith("ь"));
        System.out.println(rsl1);

        List<String> stringList = Arrays.asList("Трижды", "Три", "Триста", "Три тысячи");
        boolean rsl2 = stringList.stream()
                .allMatch(s -> s.startsWith("Три"));
        System.out.println(rsl2);
    }
}
