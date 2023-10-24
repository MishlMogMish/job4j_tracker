package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfList {
    public static final Map<Person, List<? extends Pet>>
            PET_PEOPLE = new HashMap<>();

    static {
        PET_PEOPLE.put(new Person("Dawn"),
                Arrays.asList(
                        new Cymric("Molly"),
                        new Mutt("Spot")
                )
        );
        PET_PEOPLE.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"),
                        new Cat("Elsy May"),
                        new Dog("Margrett")
                )
        );
        PET_PEOPLE.put(new Person("Marlyn"),
                Arrays.asList(
                        new Pug("Louis aka Louis Snorkelstein Dupree"),
                        new Cat("Stanford"),
                        new Cat("Pinkola")
                )
        );
        PET_PEOPLE.put(new Person("Luke"),
                Arrays.asList(
                        new Rat("Fuzzy"),
                        new Rat("Fizzy")
                )
        );
        PET_PEOPLE.put(new Person("Isaac"),
                Arrays.asList(
                        new Rat("Freckly")
                )
        );
    }

    public static void main(String[] args) {
        System.out.println("People: " + PET_PEOPLE.keySet());
        System.out.println("Pets: " + PET_PEOPLE.values());
        for (Person person : PET_PEOPLE.keySet()) {
            System.out.println(person + " has: ");
            for (Pet pet : PET_PEOPLE.get(person)) {
                System.out.println("    " + pet);
            }
        }
    }
}
