package ru.job4j.zeal.ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapLambdaUsage {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "name");
        map.put(2, "top");
        map.put(3, "user");
        map.put(4, "precision");
        map.put(5, "post");

        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

        BiFunction<Integer, String, String> function = (key, value) -> value + "_" + key;
        System.out.println();
        map.replaceAll(function);
        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
        System.out.println();

        map.computeIfPresent(1, function);
        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
        System.out.println();

        map.computeIfPresent(7, function);
        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
        System.out.println();

        Function<Integer, String> function1 = key -> "The new value  is: " + Math.pow(2, key);
        map.computeIfAbsent(8, function1);
        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
    }
}
