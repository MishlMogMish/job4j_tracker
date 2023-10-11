package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lobi2@list.ru", "Pavel Ivanov");
        map.put("ert777@mail.ru", "Iryna Kuzmina");
        map.put("haui@yandex.ru", "Jon Mak");
        map.put("lobi2@list.ru", "Conan Doyle");
        map.put("lobi2@list.ru", "Jim Kerry");

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
