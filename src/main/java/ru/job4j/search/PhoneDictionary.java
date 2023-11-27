package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> containsName = n -> n.name().contains(key);
        Predicate<Person> containsSurname = n -> n.surname().contains(key);
        Predicate<Person> containsPhone = n -> n.phone().contains(key);
        Predicate<Person> containsAddress = n -> n.address().contains(key);
        Predicate<Person> containsCombo = containsName.or(containsSurname).or(containsPhone).or(containsAddress);
        ArrayList<Person> result = new ArrayList<>();

        for (Person person : persons) {
            if (containsCombo.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
