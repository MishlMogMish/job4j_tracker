package ru.job4j.zeal.ru.job4j.enumeration;

public enum MathOperations implements Operations {
    SUM("sum of") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    }, SUBTRACTION("sub of") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    }, MULTIPLICATION("mult of") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    }, DIVISION(" of") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private String info;

    MathOperations(String info) {
        this.info = info;
    }

    public static void main(String[] args) {
        System.out.println(MathOperations.SUM.name() + " " + MathOperations.SUM.apply(35.0, 47.0));
        System.out.println(MathOperations.SUBTRACTION.name() + " " + MathOperations.SUBTRACTION.apply(35.0, 47.0));
        System.out.println(MathOperations.MULTIPLICATION.name() + " " + MathOperations.MULTIPLICATION.apply(35.0, 47.0));
        System.out.println(MathOperations.DIVISION.name() + " " + MathOperations.DIVISION.apply(35.0, 47.0));
    }
}
