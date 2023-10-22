package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        PetCreator petCreator = new PetCreator();
        List<Pet> pets = petCreator.create(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
        Pet.printPet(pets, "pets");
    }
}
