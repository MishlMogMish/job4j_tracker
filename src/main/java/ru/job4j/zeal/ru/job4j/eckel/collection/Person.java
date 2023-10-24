package ru.job4j.zeal.ru.job4j.eckel.collection;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " + name;
    }

}
