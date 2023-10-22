package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Pet implements Comparable<Pet> {

    private static int counter;
    private final int id;

    public Pet() {
        id = counter++;
    }

    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public int compareTo(Pet o) {
        return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
    }

    public static void printPet(Collection<Pet> collection, String name) {
        System.out.println(name);
        for (Pet pet : collection) {
            System.out.print(pet + " id: " + pet.id() + " , ");
        }
        System.out.println();
    }
}
