package ru.job4j.cast;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = {train, plane, bus};

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
