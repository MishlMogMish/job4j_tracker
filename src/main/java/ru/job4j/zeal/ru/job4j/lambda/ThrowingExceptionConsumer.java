package ru.job4j.zeal.ru.job4j.lambda;

@java.lang.FunctionalInterface
public interface ThrowingExceptionConsumer<T, E extends Exception> {
    void  accept(T t) throws E;
}

