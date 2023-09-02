package ru.job4j.oop;

public class Wolf {
    public void tryEat(Ball ball) {
        System.out.println("Wolf tries to eat Ball");
        ball.tryRun(false);
    }
}
