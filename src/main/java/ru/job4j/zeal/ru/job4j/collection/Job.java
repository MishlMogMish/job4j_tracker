package ru.job4j.zeal.ru.job4j.collection;

public record Job(String name, int priority) implements Comparable<Job> {

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }

    @Override
    public String toString() {
        return "Job{"
                + "name='" + name + '\''
                + ", priority=" + priority
                + '}';
    }
}
