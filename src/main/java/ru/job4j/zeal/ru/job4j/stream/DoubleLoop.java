package ru.job4j.zeal.ru.job4j.stream;

import ru.job4j.stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoubleLoop {
    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .peek(x -> {
                    if (x != null) {
                        System.out.println("before flatmap" + x + " " + x.getClass().getSimpleName());
                    }
                })
                .flatMap(
                        t -> Stream.ofNullable(t)
                                .peek(t1 -> System.out.println("in flatmap " + t1 + " " + t1.getClass().getSimpleName()))
                )
                .peek(x -> System.out.println("after flatmap" + x + " " + x.getClass().getSimpleName()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(23, "name1"),
                null,
                new Student(2, "name2"),
                null
        );
        DoubleLoop doubleLoop = new DoubleLoop();
        System.out.println(doubleLoop.levelOf(list, 3));
    }

}

