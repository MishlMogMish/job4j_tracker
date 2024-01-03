package ru.job4j.map;

import java.util.*;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        return Optional.ofNullable(students.keySet())
                .stream()
                .flatMap(Set::stream)
                .filter(student -> student.account().equals(account))
                .findFirst();

    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> opStudent = findByAccount(account);

        return opStudent
                .flatMap(optionalStudent -> Optional.ofNullable(students.get(optionalStudent))
                .stream()
                .flatMap(Set::stream)
                .filter(subject -> subject.name().equals(name))
                .findFirst());
    }
}
