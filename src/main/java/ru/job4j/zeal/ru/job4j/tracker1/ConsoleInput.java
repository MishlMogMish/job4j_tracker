package ru.job4j.zeal.ru.job4j.tracker1;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
