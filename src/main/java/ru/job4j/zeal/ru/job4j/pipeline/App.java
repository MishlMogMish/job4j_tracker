package ru.job4j.zeal.ru.job4j.pipeline;

public class App {
    public static void main(String[] args) {
        var filters = new Pipeline<>(
                new RemoveAlphabetsHandler())
                .addHandler(new RemoveDigitHandler())
                .addHandler(new ConvertToCharArrayHandler())
                .addHandler(new Finisher());

        System.out.println("Finisher: " + filters.execute("GoYankees123!"));
    }
}
