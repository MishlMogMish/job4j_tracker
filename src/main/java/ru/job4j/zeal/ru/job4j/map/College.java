package ru.job4j.zeal.ru.job4j.map;

import java.util.Map;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Student findByAccount(String account) {
        for (Student student : students.keySet()) {
            if (student.account().equals(account)) {
                return student;
            }
        }
        return null;
    }

    public Student findByAccountStream(String account) {
        return students.keySet()
                .stream()
                .filter(s -> s.account().equals(account))
                .findFirst()
                .orElse(null);
    }

    public Subject findBySubjectName(String account, String name) {
        Student studentAcc = findByAccountStream(account);
        if (studentAcc != null) {
            Set<Subject> subjects = students.get(studentAcc);
            for (Subject subject : subjects) {
                if (subject.name().equals(name)) {
                    return subject;
                }
            }
        }
        return null;
    }

    public Subject findBySubjectNameStream(String account, String name) {
        Student student = findByAccountStream(account);
        if (student == null) {
            return null;
        }
        return students.get(student).stream()
                .filter(s -> s.name().equals(name))
                .peek(System.out::println)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(students);
        Student student = college.findByAccount("000001");
        System.out.println("Найденный студент: " + student);
        Subject english = college.findBySubjectName("000001", "English");
        System.out.println("Оценка по найденному предмету " + english.name() + " : " + english.score());
        System.out.println(students);

        Student student1 = college.findByAccountStream("000001");
        System.out.println("Найденный студент: " + student1);
        Subject english1 = college.findBySubjectNameStream("000001", "Math");
        System.out.println("Оценка по найденному предмету " + english1.name() + " : " + english1.score());
    }
}
