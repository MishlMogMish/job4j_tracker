package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball) {
        System.out.println("Fox tries to eat Ball");
        ball.tryRun(true);
    }
}
