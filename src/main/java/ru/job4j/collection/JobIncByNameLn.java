package ru.job4j.collection;

import java.util.Comparator;

public class JobIncByNameLn implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.name().length(), o2.name().length());
    }
}
