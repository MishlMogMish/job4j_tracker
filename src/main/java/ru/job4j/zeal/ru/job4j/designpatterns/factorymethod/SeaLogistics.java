package ru.job4j.zeal.ru.job4j.designpatterns.factorymethod;

public class SeaLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Ship(500);
    }
}
