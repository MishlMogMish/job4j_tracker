package ru.job4j.zeal.ru.job4j.poly;
public interface Vehicle extends Trailer {
    static final int  VELICITY_OF_LIGHT = 300000;

    void transportPeople();

    void carryLoads();

    static void showRoadMap() {
        System.out.println("Here are you roadMap");
    }

    default void getRoadInfo(String info) {
        System.out.println("General road info \""  + info + "\"");
    }
}
