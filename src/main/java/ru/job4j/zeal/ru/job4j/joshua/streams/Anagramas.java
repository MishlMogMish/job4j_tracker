package ru.job4j.zeal.ru.job4j.joshua.streams;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Anagramas {

    public static void main(String[] args) throws IOException {
        File dictionary = new File("C:/projects/test1.txt");
        int minGroupSize = 2;
        Map<String, Set<String>> groups = new HashMap<>();

        try (Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word), (unused) -> new TreeSet<>())
                        .add(word);
            }
        }

        for (Set<String> group : groups.values()) {
            if (group.size() >= minGroupSize) {
                System.out.println(group.size() + ": " + group);
            }
        }
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
