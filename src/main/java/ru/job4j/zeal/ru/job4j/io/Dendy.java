package ru.job4j.zeal.ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры:");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.println("Введите пункт меню, чтобы начать игру: ");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 3) {
                System.out.println("Игра завершена.");
                run = false;
            } else if (choice == 1) {
                System.out.println("Танчики загружаются ... ");
            } else if (choice == 2) {
                System.out.println("Супер Марио загружается ...");
            } else {
                System.out.println("Такой игры нет.");
            }
            System.out.println();
        }
    }
}
