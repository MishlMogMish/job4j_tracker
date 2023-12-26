package ru.job4j.zeal.ru.job4j.joshua.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class StreamAnagrams {
    public static void main(String[] args) throws IOException {
        Path dictionary = Paths.get("C:/projects/test1.txt");
        int minGroupSize = 2;

        try (Stream<String> words = Files.lines(dictionary)) {
            words.flatMap(s -> Arrays.stream(s.split(" ")))
                    .map(s -> s.toLowerCase().strip())
                    .filter(s -> !s.contains(".") && !s.contains(","))
                    .collect(
                            groupingBy(word -> word.chars().sorted().collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append).toString())
                    )
                    .values().stream()
                    .map(TreeSet::new)
                    .filter(group -> group.size() >= 2)
                    .map(group -> group.size() + ": " + group)
                    .forEach(System.out::println);
        }
    }
}
