package ru.job4j.oop;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.accelerate();
        truck.steer();
        truck.brake();
        System.out.println();

        Athlete athlete = new Athlete();
        athlete.run();
        athlete.sprint();
        System.out.println();

        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.run();
        footballPlayer.footKick();
    }
}
