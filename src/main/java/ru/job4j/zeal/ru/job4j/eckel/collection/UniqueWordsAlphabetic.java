package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsAlphabetic {
    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(
                Paths.get("src/main/java/ru/job4j/zeal/ru/job4j/eckel/collection/SetOperation.java")
        );
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String line : lines) {
            for (String word : line.split("\\W+")) {
                if (word.trim().length() > 0) {
                    words.add(word);
                }
            }
        }
        System.out.println(words);

    }
}
