package ru.job4j.zeal.ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapLambdaUsageMerge {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Shoes", 200);
        map.forEach((key, value) -> System.out.println("At the the beginning the Key is: "
                + key + " , value: " + value));

        BiFunction<Integer, Integer, Integer> function = (oldValue, newValue) -> oldValue - newValue;
        map.merge("Shoes", 50, function);

        map.forEach((key, value) -> System.out.println("After merge the Key is: " + key + " , value: " + value));
        System.out.println("Old price of shirt is: " + map.merge("Shirt", 100, function));

        map.forEach((key, value) -> System.out.println("Key: " + key + " , value: " + value));

        System.out.println("Old price of shirt is: " + map.merge("Shirt", 100, function));
        map.forEach((key, value) -> System.out.println("Key: " + key + " , value: " + value));
    }
}
