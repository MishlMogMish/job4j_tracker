package ru.job4j.zeal.ru.job4j.inheritance;

public class Father {

    protected int age;
    public static String food;

    public Father() {
    }

    public Father(int age) {
        this.age = age;
        System.out.println("Father class " + "age is: " + age);
    }

    public static void show() {
        System.out.println("Show from Father static " + food);
    }

    public void printTest() {
        System.out.println("Father Printtest");
    }

    public void print() {
        System.out.println("Print of father class");
        Father father = new Father();
        father.show();
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.show();
    }
}
