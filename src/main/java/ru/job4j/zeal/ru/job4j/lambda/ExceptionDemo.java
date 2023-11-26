package ru.job4j.zeal.ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionDemo {
    public static void specialFunc(int i) throws ArithmeticException {
        int rsl = i / (i - 4);
        System.out.println(i);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(throwingExceptionWrapper(n -> specialFunc(n)));

        numbers.forEach(n -> {
            try {
                specialFunc(n);
            } catch (ArithmeticException e) {
                System.out.println("Пропускаем и идем дальше");
            }
        });

        numbers.forEach(throwingExceptionWrapper(n -> specialFunc(n)));
    }

    static <T> Consumer<T> throwingExceptionWrapper(
            ThrowingExceptionConsumer<T, Exception> throwingExceptionConsumer) {
        return  x -> {
            try {
                throwingExceptionConsumer.accept(x);
            } catch (Exception e) {
                System.out.println("Обрабатываем игнорированием ошибку: " + e);
            }
        };
    }
}
