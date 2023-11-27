package ru.job4j.zeal.ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectoinLambdaUsage {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("name");
        collection.add("top");
        collection.add("user");
        collection.add("precision");
        collection.add("post");

        collection.forEach(System.out::println);
        Predicate<String> predicate = s -> s.length() == 4;
        collection.removeIf(predicate);
        System.out.println();
        collection.forEach(System.out::println);
    }
}
