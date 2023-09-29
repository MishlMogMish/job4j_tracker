package ru.job4j.zeal.ru.job4j.vararg;

public class SimpleCalculator {

    public static int sum(int... numbers) {

        int result = 0;

        for (int i : numbers) {

            result += i;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sum(2, 9));
    }
}