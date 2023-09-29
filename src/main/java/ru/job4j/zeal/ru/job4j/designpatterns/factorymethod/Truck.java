package ru.job4j.zeal.ru.job4j.designpatterns.factorymethod;

public class Truck implements Transport {
    int cargoWeight;

    public Truck() {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void deliver() {
        System.out.println("500 kg delivered by truck");
    }
}
