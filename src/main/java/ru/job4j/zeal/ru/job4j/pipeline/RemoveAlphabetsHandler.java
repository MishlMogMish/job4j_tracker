package ru.job4j.zeal.ru.job4j.pipeline;

import java.util.stream.IntStream;

public class RemoveAlphabetsHandler implements Handler<String, String> {
    @Override
    public String process(String input) {
        return IntStream.range(0, input.length())
                .map(input::charAt)
                .filter(ch -> !Character.isLetter(ch))
                .mapToObj(Character::toString)
                .peek(ch -> System.out.println("Remove Alphabet handler: " + ch))
                .reduce(String::concat)
                .orElse("");
    }
}
