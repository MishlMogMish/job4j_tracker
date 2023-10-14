package ru.job4j.zeal.ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("YFix bugs", 4),
                new Job("Impl tasks", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortedByNameJob());
        System.out.println(jobs);
        Collections.sort(jobs, new SortDescByNameJob());
        System.out.println(jobs);
        jobs.sort(new SortedByNameJob());
        System.out.println(jobs);
    }
}
