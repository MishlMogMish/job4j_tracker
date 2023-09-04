package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Макаров Андрей Викторович");
        student.setGroup("А-112");
        student.setDate(new Date());
        System.out.println("ФИО: " + student.getName() + ", группа: " + student.getGroup() + ", дата поступления: " + student.getDate());
    }
}
