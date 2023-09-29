package ru.job4j.zeal.ru.job4j.abstr;

public class Concrete extends AbstractConstructor {
    int third;

    public Concrete(int first, int second, int third) {
        super(first, second);
        this.third = third;
    }

    public void printMore() {
        System.out.println(super.getFirst());
    }

    @Override
    void printInfo(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Concrete concrete = new Concrete(1, 2, 3);
        concrete.printMore();
        Object object = new Object();
    }
}
