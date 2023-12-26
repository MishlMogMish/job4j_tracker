package ru.job4j.zeal.ru.job4j.modern;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        Stream<String> value = Stream.of("os.name", "user.dir", "java.runtime.version")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)))
                .peek(System.out::println);
        List<String> list = value.collect(Collectors.toList());
        System.out.println(list);
        System.out.println(System.getProperty("os.name"));
    }
}
