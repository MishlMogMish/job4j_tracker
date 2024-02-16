package ru.job4j.zeal.ru.job4j.pipeline;

import java.util.Arrays;

public class Finisher implements Handler<char[], String> {
    @Override
    public String process(char[] input) {
        return Arrays.toString(input);
    }
}
