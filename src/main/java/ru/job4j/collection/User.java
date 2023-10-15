package ru.job4j.collection;

import java.util.Objects;

public record User(String name, int age) implements Comparable<User> {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(User another) {
        int result = name.compareTo(another.name);
        return result == 0 ? Integer.compare(age, another.age) : result;
    }
}

