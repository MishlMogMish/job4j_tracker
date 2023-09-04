package ru.job4j.inheritance;

public class Child extends Parent {
    private String patronymic;

    public Child(String name, int age, String patronymic) {
        super(name, age);
        this.patronymic = patronymic;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " " + patronymic + " " + getAge());
    }

    public static void main(String[] args) {
        Parent bob = new Parent("Bob", 45);
        Child tom = new Child("Tom", 12, "Bobovich");
        bob.printInfo();
        tom.printInfo();
    }
}


