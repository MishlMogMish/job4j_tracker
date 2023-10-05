package ru.job4j.zeal.ru.job4j.poly;

public class Minivan implements Vehicle {
    private String name = "Minivan";

    @Override
    public void trailerAttach() {
        System.out.println(name + " is driving with camping trailer attached");
    }

    @Override
    public void transportPeople() {
        System.out.println(name + " is transferring 4 people");
    }

    @Override
    public void carryLoads() {
        System.out.println(name + " is carrying 300 kg");
    }

    @Override
    public void getRoadInfo(String info) {
        System.out.println("New minivan info system warning: " + info);
    }

    public static void main(String[] args) {
        Vehicle minivan = new Minivan();

        minivan.carryLoads();
        minivan.transportPeople();
        minivan.trailerAttach();
        minivan.getRoadInfo("It's big rain now");
        System.out.println();
        System.out.println(VELICITY_OF_LIGHT);
    }
}

