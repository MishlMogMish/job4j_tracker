package ru.job4j.zeal.ru.job4j.person;

import java.util.Arrays;

public record Person(String name, String gender) {

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", gender='" + gender + '\''
                + '}';
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Mike", "male"),
                new Person("Kate", "female"),
                new Person("Nike", "male"),
                new Person("She", "female"),
        };

        Person[] men = Arrays.stream(people)
                .filter(p -> p.gender.equals("male"))
                .toArray(Person[]::new);

        for (Person person : men) {
            System.out.println(person);
        }

    }
}
