package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Едем");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Вместимость (человек): " + number);
    }

    @Override
    public double refuel(int litres) {
        System.out.println(" Запрвляется топливо (литры): " + litres);
        return litres * 60.20;
    }
}
