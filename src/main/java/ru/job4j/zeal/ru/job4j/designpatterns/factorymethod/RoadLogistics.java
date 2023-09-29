package ru.job4j.zeal.ru.job4j.designpatterns.factorymethod;

public class RoadLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Truck();
    }
}
