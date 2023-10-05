package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        if (!tasks.isEmpty()) {
            for (Task element : tasks) {
                if (element.priority() > task.priority()) {
                    break;
                }
                index++;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        Task task1 = new Task("to up", 5);
        Task task2 = new Task("to up", 7);
        Task task3 = new Task("to up", 514);
        Task task4 = new Task("to up", 2);
        Task task5 = new Task("to up", 309);
        Task task6 = new Task("to up", 31);
        Task task7 = new Task("to up", 3);
        Task task8 = new Task("to up", 33);
        Task task9 = new Task("to up", 3);

        queue.put(task1);
        queue.put(task2);
        queue.put(task3);
        queue.put(task4);
        queue.put(task5);
        queue.put(task6);
        queue.put(task7);
        queue.put(task8);
        queue.put(task9);

        System.out.println(queue.take().priority());
        System.out.println(queue.take().priority());
        System.out.println(queue.take().priority());
        System.out.println(queue.take().priority());
        System.out.println(queue.take().priority());
        System.out.println(queue.take().priority());
        System.out.println(queue.take().priority());
        System.out.println(queue.take().priority());
        System.out.println(queue.take().priority());
    }
}
