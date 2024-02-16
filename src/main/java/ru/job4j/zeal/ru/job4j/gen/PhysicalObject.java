package ru.job4j.zeal.ru.job4j.gen;

import java.util.Comparator;

public class PhysicalObject implements Comparator {
    double weight;

    public PhysicalObject(double weight) {
        this.weight = weight;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
