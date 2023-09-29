package ru.job4j.zeal.ru.job4j.designpatterns.factorymethod;

import java.util.Random;

public class TransportCompany {
    private Logistics logistics;

    public TransportCompany(Logistics logistics) {
        this.logistics = logistics;
    }

    public void demonstrate() {
        this.logistics.planDelivery();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Logistics logistics;
        logistics = random.nextInt(4) % 2 == 0 ? new SeaLogistics() : new RoadLogistics();
        TransportCompany transportCompany = new TransportCompany(logistics);
        transportCompany.demonstrate();

    }
}
