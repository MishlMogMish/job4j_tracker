package ru.job4j.oop;

public class Hare {
    public void tryEat(Ball ball) {
        System.out.println("Hare tries to eat Ball");
        ball.tryRun(false);
    }
}
