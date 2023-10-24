package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.LinkedList;

public class LinkedListFeatures {

    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(PetCreator.create(5));
        System.out.println(pets);
        Pet.printPet(pets, " pets");
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());
        System.out.println("pets.peek(): " + pets.peek());
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets.removeFirst(): " + pets.removeFirst());
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);
        Pet.printPet(pets, "pets");
        pets.addFirst(new Rat());
        System.out.println("After addFirst: " + pets);
        Pet.printPet(pets, "pets");
        pets.offer(new Rat());
        System.out.println("After offer(): " + pets);
        Pet.printPet(pets, "pets");
        pets.add(new Rat());
        System.out.println("After add: ");
        Pet.printPet(pets, "pets");
        pets.addLast(new Hamster());
        System.out.println("After addLast: ");
        Pet.printPet(pets, "pets");
        System.out.println("After removeLast: " + pets.removeLast());
        Pet.printPet(pets, "pets");
    }
}
