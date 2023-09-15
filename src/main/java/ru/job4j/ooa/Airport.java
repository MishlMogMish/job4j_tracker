package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final AirBus airBus = new AirBus("A320");
        System.out.println(airBus);
        airBus.printModel();
        airBus.printCountEngine();

        airBus.setName("A380");
        System.out.println(airBus);
        airBus.printCountEngine();

        AirBus airBus1 = new AirBus("A380");
        System.out.println(airBus1);
    }
}
