package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.ArrayList;
import java.util.List;

public class PetCreator {
    private static List<Pet> allPets = new ArrayList<>();

    public static List<Pet> create(int num) {
        if (num-- > 0) {
            allPets.add(new Rat());
        }
        if (num-- > 0) {
            allPets.add(new Manx());
        }
        if (num-- > 0) {
            allPets.add(new Cymric());
        }
        if (num-- > 0) {
            allPets.add(new Mutt());
        }
        if (num-- > 0) {
            allPets.add(new Pug());
        }
        if (num-- > 0) {
            allPets.add(new Cymric());
        }
        if (num-- > 0) {
            allPets.add(new Pug());
        }
        if (num-- > 0) {
            allPets.add(new Manx());
        }
        if (num-- > 0) {
            allPets.add(new Cymric());
        }
        if (num-- > 0) {
            allPets.add(new Rat());
        }
        if (num-- > 0) {
            allPets.add(new EgyptianMau());
        }
        if (num-- > 0) {
            allPets.add(new Hamster());
        }
        return allPets;
    }
}
