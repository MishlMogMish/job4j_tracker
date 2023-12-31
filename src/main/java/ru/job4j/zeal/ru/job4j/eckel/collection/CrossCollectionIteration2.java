package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.*;

public class CrossCollectionIteration2 {
    public static void display(Iterable<Pet> ip) {
        Iterator<Pet> it = ip.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> pets = PetCreator.create(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        System.out.println("ArrayList: ");
        display(pets);
        System.out.println();
        System.out.println("LinkedList: ");
        display(petsLL);
        System.out.println();
        System.out.println("HashSet: ");
        display(petsHS);
        System.out.println();
        System.out.println("TreeSet: ");
        display(petsTS);
    }
}
