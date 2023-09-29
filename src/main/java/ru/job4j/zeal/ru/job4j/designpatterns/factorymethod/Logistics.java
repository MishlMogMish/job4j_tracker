package ru.job4j.zeal.ru.job4j.designpatterns.factorymethod;

abstract class Logistics {
    public void planDelivery() {
    Transport transport = createTransport();
    transport.deliver();
    }

    abstract Transport createTransport();
}
