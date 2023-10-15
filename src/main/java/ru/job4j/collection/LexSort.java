package ru.job4j.collection;

import static java.lang.Integer.parseInt;
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftArr = left.split(". ");
        String[] rightArr = right.split(". ");
        return Integer.compare(parseInt(leftArr[0]), parseInt(rightArr[0]));
    }
}
