package ru.job4j.zeal.ru.job4j.joshua.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Anagrams1 {
    public static void main(String[] args) throws IOException {
        Path dictionary = Paths.get("C:/projects/test1.txt");
        int minGroupSize = 3;
        try (Stream<String> words = Files.lines(dictionary)) {
            words.flatMap(s -> Arrays.stream(s.split(" ")))
                    .map(String::toLowerCase)
                    .collect(groupingBy(Anagrams1::alphabetize, Collectors.toSet()))
                    .values().stream()
                    .filter(group -> group.size() >= 2 && group.size() <= 4)
                    .forEach(group -> System.out.println(group.size() + ": " + group));
        }
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
