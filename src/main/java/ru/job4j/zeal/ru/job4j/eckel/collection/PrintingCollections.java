package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.*;

public class PrintingCollections {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList");
        System.out.println(fill(new ArrayList<>()));
        System.out.println("LinkedList");
        System.out.println(fill(new LinkedList<>()));
        System.out.println();
        System.out.println("HashSet");
        System.out.println(fill(new HashSet<>()));
        System.out.println();
        System.out.println("TreeSet");
        System.out.println(fill(new TreeSet<>()));
        System.out.println("LinkedHashSet");
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println();
        System.out.println("HashMap");
        System.out.println(fill(new HashMap<>()));
        System.out.println();
        System.out.println("TreeMap");
        System.out.println(fill(new TreeMap<>()));
        System.out.println("LinkedHashMap");
        System.out.println(fill(new LinkedHashMap<>()));
    }
}
