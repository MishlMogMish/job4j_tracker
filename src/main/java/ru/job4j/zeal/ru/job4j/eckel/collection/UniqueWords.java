package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) throws Exception {
        List<String>  lines = Files.readAllLines(
                Paths.get("src/main/java/ru/job4j/zeal/ru/job4j/eckel/collection/SetOperation.java")
        );
        Set<String> words = new TreeSet<>();
        for (String line : lines) {
            for (String word : line.split("\\W+")) {
                words.add(word);
            }
        }
        System.out.println(words.contains(""));
        words.remove("");
        System.out.println(words);

    }
}
