package ru.job4j.queue;

import java.util.Comparator;

public class TastByPositionInk implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.position().compareTo(o2.position());
    }
}
