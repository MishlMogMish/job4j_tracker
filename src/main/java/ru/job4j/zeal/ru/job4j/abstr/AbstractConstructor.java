package ru.job4j.zeal.ru.job4j.abstr;

abstract class AbstractConstructor {
    private int first;
    private int second;

    protected int getFirst() {
        return first;
    }

    public AbstractConstructor(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        System.out.println("Print from abstract class");
    }

    abstract void printInfo(int i);
}
