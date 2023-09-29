package ru.job4j.zeal.ru.job4j.record;

public record Somebody(String name, int age) implements Printable {
    @Override
    public void print() {
        System.out.println("name " + name + " , age " + age);
    }

    public static void main(String[] args) {
        Somebody somebody = new Somebody("Like", 35);
        System.out.println(somebody.name + " " + somebody.age);
    }
}
