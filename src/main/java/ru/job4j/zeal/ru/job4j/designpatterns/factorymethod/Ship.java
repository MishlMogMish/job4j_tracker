package ru.job4j.zeal.ru.job4j.designpatterns.factorymethod;

public class Ship implements Transport {
    int cargoWeight;

    public Ship(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void deliver() {
        System.out.println("5000 kg delivered by ship");
    }
}
