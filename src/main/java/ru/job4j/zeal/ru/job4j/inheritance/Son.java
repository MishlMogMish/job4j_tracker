package ru.job4j.zeal.ru.job4j.inheritance;

public class Son extends Father {

    public Son() {
        System.out.println("Son class");
    }

    public void sonPrint() {
        System.out.println("Print of Son instance");
    }

    @Override
    public final void print() {
        System.out.println("Father print overridden by Son instance");
    }

    public static void show() {
        System.out.println("Hided show by Son static");
    }

    public void printTest() {
        System.out.println("Son overridden printTest instance");
    }

    public String printTest(String info) {
        return "Overloaded instance method " + info;
    }

    public static void main(String[] args) {
        Father sonOfFather = new Son();
        Son sonOfSon = new Son();
        sonOfFather.print();
        sonOfSon.sonPrint();
        System.out.println("age " + sonOfFather.age);
        Son.show();
        Father.staticShow();
        sonOfFather.printTest();
        System.out.println(sonOfSon.printTest("try"));
        System.out.println();

        sonOfSon.printTest();
        sonOfFather.printTest();
        System.out.println();

        System.out.println();
        sonOfSon.print();
        System.out.println("now");
        sonOfFather.print();

        System.out.println();

        Son.show();
        Father.staticShow();
        sonOfSon.show();
        sonOfFather.staticShow();
    }
}

