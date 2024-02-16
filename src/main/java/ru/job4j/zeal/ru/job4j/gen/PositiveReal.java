package ru.job4j.zeal.ru.job4j.gen;

public class PositiveReal extends Real {
    PositiveReal(double r) {
        super(r);
        System.out.println("It's Positive Real class!");
        if (r < 0) {
            System.out.println("Assertion is failed! r is less then 0, it equals: " + r);
        }
        assert (r > 0.0);
    }

}
