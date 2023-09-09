package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println("Всего спичек: " + count);
            System.out.println(player + " введите число от 1 до 3: ");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches < 1 || matches > 3 || count < matches) {
                System.out.println();
                System.out.println("Введите правильное число от 1 до 3 и не больше чем осталось спичек: ");
                turn = !turn;
            } else if (count == matches) {
                System.out.println(player + " победил!");
                break;
            } else {
                System.out.println("Ход переходит другому игроку\n");
                count -= matches;
            }
        }
    }
}
