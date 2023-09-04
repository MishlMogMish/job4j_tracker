package ru.job4j.oop;

public class Calc {

    public static class Square {
        private final int rsl;

        public Square(int number) {
            rsl = number;
        }

        public int getResult() {
            return rsl;
        }
    }

    public static Square getSquare(int value) {
        int result = value * value;
        return new Square(result);
    }

    public static void main(String[] args) {
        System.out.println("Квадрат 27 равен " + Calc.getSquare(27).getResult());
    }
}
