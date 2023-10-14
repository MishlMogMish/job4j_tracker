package ru.job4j.zeal.ru.job4j.collection;

import java.util.Comparator;

public class SortedByNameJob implements Comparator<Job> {
    @Override
    public int compare(Job left, Job right) {
        return left.name().compareTo(right.name());
    }
}
