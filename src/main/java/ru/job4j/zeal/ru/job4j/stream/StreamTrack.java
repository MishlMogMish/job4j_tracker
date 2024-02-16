package ru.job4j.zeal.ru.job4j.stream;

import java.util.stream.IntStream;

public class StreamTrack {

    public static void main(String[] args) {
        int sum = IntStream.range(1, 5)
                .filter(i -> i < 4)
                .sum();
    }
}
