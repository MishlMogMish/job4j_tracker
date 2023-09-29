package ru.job4j.zeal.ru.job4j.poly;

public class Bus implements Vehicle {
    private  String name = getClass().getSimpleName();

    @Override
    public void trailerAttach() {
        System.out.println(name + " is driving without trailer");
    }

    @Override
    public void transportPeople() {
        System.out.println(name + " is transferring 30 people now");
    }

    @Override
    public void carryLoads() {
        System.out.println(name + " is carrying 1500 kg");
    }

    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Boolean i = bus instanceof Store;

        bus.carryLoads();
        bus.transportPeople();
        bus.trailerAttach();
        bus.getRoadInfo("It's ok");
        System.out.println();
        System.out.println(VELICITY_OF_LIGHT);
        System.out.println(i);
    }
}
