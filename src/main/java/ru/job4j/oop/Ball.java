package ru.job4j.oop;

public class Ball {
    public void tryRun(Boolean condition) {
        System.out.println("Ball tries to run... ");
        if (condition) {
            System.out.println("Ball was eaten.");
        } else {
            System.out.println("Ball has run away!");
            System.out.println();
        }
    }
}
