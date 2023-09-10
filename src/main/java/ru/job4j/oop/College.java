package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        /* приведение к типу родителя Freshman - повышающее*/
        Student student = freshman;
        /* приведение к типу родителя Object - повышающее*/
        Object object = freshman;
        /* приведение при создании объекта - повышающее*/
        Student student1 = new Freshman();
        Object object1 = new Freshman();
        /* приведение типа за счет понижения по иерархии - понижающее*/
        Student student2 = (Student) object;
    }
}
