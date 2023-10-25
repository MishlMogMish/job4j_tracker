package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.Map;

public class EnviromentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
