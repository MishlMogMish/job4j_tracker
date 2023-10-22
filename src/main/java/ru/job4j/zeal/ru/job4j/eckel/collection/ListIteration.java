package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        PetCreator creator = new PetCreator();
        List<Pet> pets = creator.create(8);
        ListIterator<Pet> it = pets.listIterator();
        int counter = 5;
        while (it.hasNext()  && counter-- > 0) {
            System.out.print(
                    it.previousIndex()
                    + ", " + it.nextIndex()
                    + ", " + it.next() + ";    "
            );
        }
        System.out.println();
        while (it.hasPrevious()) {
            System.out.print(it.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);
        Pet.printPet(pets, "pets");
        System.out.println();
        it = pets.listIterator(3);
        counter = 3;
        while (it.hasNext() && counter-- > 0) {
            it.next();
            it.set(new Rat());
        }
        System.out.println(pets);
        Pet.printPet(pets, "pets");
        System.out.println(it.nextIndex());
    }
}

