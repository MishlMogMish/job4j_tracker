package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.*;

public class CrossCollectionIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PetCreator creator = new PetCreator();
        List<Pet> pets = creator.create(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        System.out.println("ArrayList: ");
        display(pets.iterator());
        System.out.println();
        System.out.println("LinkedList: ");
        display(petsLL.iterator());
        System.out.println();
        System.out.println("HashSet: ");
        display(petsHS.iterator());
        System.out.println();
        System.out.println("TreeSet: ");
        display(petsTS.iterator());
    }
}
