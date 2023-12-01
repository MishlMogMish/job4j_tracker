package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (double i = start; i < end; i++) {
            rsl.add(func.apply(i));
        }
        return rsl;
    }

    public static void main(String[] args) {
        FunctionCalculator functionCalculator = new FunctionCalculator();
        System.out.println(functionCalculator.diapason(4, 17, n -> Math.sqrt(n)));
    }

}