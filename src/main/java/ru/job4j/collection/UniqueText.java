package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEqual(String origText, String duplicatedText) {
        boolean rsl = true;
        String[] origin = origText.split(" ");
        String[] text = duplicatedText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String word : origin) {
            check.add(word);
        }
        for (String word : text) {
            if (!check.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
