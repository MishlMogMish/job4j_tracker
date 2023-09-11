package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = freshman;
        Student student1 = new Freshman();
        Object object1 = new Freshman();
        Student student2 = (Student) object;
    }
}
