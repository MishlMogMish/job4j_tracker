package ru.job4j.ooa;

public final class AirBus extends Aircraft {
    private static final int COUNT_ENGINE = 2;
    private String name;

    public AirBus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCountEngine() {
        int numberOfEngines = "A380".equals(name) ? 4 : COUNT_ENGINE;
        System.out.println(numberOfEngines);
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name'" + name + '\''
                + '}';
    }
}
