package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    private final HashSet<Task> tasks = new HashSet<>();

    public List<String> extractNumber(List<Task> list) {
        tasks.addAll(list);

        List<String> tempList = new ArrayList<>();
        for (Task task : tasks) {
            tempList.add(task.number());
        }
        return tempList;
    }

}
