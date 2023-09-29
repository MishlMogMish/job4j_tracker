package ru.job4j.zeal.ru.job4j.record;

public record Student(String name, int age) {

    public Student {
        if (age > 20) {
            throw new IllegalArgumentException(" not that age");
        }
    }
}
