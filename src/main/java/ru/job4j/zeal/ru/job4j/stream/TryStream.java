package ru.job4j.zeal.ru.job4j.stream;

import java.util.*;

public class TryStream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("srt1", "str100", "str190", "str2");
        Comparator<String> compText = (left, right) -> left.compareTo(right);

        list.sort(compText);
        System.out.println(list);
         Comparator<String> compDescSize = (left, right) -> Integer.compare(right.length(), left.length());
        list.sort(compDescSize);
        System.out.println(list);
    }

}

