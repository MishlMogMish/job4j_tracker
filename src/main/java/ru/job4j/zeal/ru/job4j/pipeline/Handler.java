package ru.job4j.zeal.ru.job4j.pipeline;

public interface   Handler<I, O> {
    O process(I input);
}
