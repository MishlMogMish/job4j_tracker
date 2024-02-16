package ru.job4j.zeal.ru.job4j.stream;

import java.util.stream.IntStream;

public class Prudence {
    public static int doSum() {
        return IntStream.range(1, 5)
                .filter(i -> i < 3)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(doSum());
    }
}
