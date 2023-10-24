package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.Collection;

class Pet implements Comparable<Pet> {

    private String name;
    private static int counter;
    private final int id;

    public Pet() {
        id = counter++;
    }

    public Pet(String name) {
        id = counter++;
        this.name = name;
    }

    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + (name != null ? name : "");
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
