package ru.job4j.zeal.ru.job4j.record;

public record Book(String title, String author, Edition edition) {
    public interface Edition {
        String getName();
    }
}
