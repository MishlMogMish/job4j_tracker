package ru.job4j.zeal.ru.job4j.tracker;

public class GrandSon extends Son {

    GrandSon() {
        super();
        System.out.println("GrandSon class");
    }

    public static void show() {
        System.out.println("Static show hided by grandson");
    }

    public void grandSonPrint() {
        System.out.println("GrandSon print");
    }

    public static void main(String[] args) {
        GrandSon grandSon = new GrandSon();
        grandSon.print();
        grandSon.sonPrint();
        grandSon.grandSonPrint();
        System.out.println("age " + grandSon.age);
        Father.show();
        grandSon.printTest();
        Father father = new Father();
        father.printTest();
        grandSon.show();
        GrandSon.show();
        Son.show();
    }
}
