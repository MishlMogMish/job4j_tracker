package ru.job4j.zeal.ru.job4j.gen;

public class Real implements Comparable<Real> {
    private final double value;

    Real(double r) {
        this.value = r;
        System.out.println(" It's Real class");
    }

    double getValue() {
        return value;
    }

    @Override
    public int compareTo(Real o) {
        return Double.compare(this.getValue(), o.getValue());
    }
}
