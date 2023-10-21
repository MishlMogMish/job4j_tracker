package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Simple collection use( suppressing compiler warnings)
 * {ThrowsException}
 */
class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {

}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        AbstractList apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
            apples.add(new Orange());
            for (Object apple : apples) {
                ((Apple) apple).id();
            }
        }
    }
}
