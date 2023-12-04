package ru.job4j.zeal.ru.job4j.stream;

import ru.job4j.zeal.ru.job4j.stream.mapto.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        Optional<Integer> sum = nums.stream()
                .reduce(Integer::sum);
        System.out.println(sum.get());
        System.out.println();

        List<String> numStrings = List.of("One", "Two", "Three");
        Optional<String> string = numStrings.stream()
                .reduce((a, b) -> a + " and " + b);
        System.out.println(string.get());
        System.out.println();

        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sumAge = people.stream()
                .reduce(0, (integer, person) -> {
                            if (person.getAge() > 25) {
                                return integer + person.getAge();
                            } else {
                                return integer;
                            }
                        },
                        Integer::sum
                );
        System.out.println(sumAge);
        System.out.println();

        int min = people.parallelStream()
                .reduce(
                        0,
                        (a, b) -> a + b.getAge(),
                        Integer::min
                );
        System.out.println(min);

    }
}
