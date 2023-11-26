package ru.job4j.zeal.ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {

    private static String first = "Гав";
    private static String second = "Муу";

    public static void main(String[] args) {
        String ay = "ayyyyy";
        ay = " aaa";
        String temp = ay;
        String name = echo(
                () ->  {
                    second = "Мяу";
                    return temp;
                }
        );
        System.out.println(ay);
        System.out.println(name);
    }

    private static String echo(Supplier<String> supplier) {
        String sound = supplier.get();
        return sound + " " + sound + " " + sound;
    }
}
