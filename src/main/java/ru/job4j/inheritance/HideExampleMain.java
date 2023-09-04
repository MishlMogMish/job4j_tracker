package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Cat cat1 = new Cat();

        System.out.print("animal.instanceInvoke(); ");
        animal.instanceInvoke();
        System.out.println();
        System.out.print("cat.instanceInvoke(); ");
        cat.instanceInvoke();
        System.out.println();
        System.out.print("Animal.staticInvoke(); ");
        Animal.staticInvoke();
        System.out.println();
        System.out.print("Cat.staticInvoke(); ");
        Cat.staticInvoke();
        System.out.println();
        cat1.staticInvoke();
    }
}
