package ru.job4j.zeal.ru.job4j.lambda;

import java.util.Arrays;

public class IterableLambdaUsage {
    public static void main(String[] args) {
        Iterable<String> iterable = Arrays.asList(
                "name",
                "top",
                "precision",
                "post"
        );
        iterable.forEach(System.out::println);
    }
}
