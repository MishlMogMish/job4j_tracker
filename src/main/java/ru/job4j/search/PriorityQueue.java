package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс описывает работу простейшей очереди по приоритетуБ которая работает
 * по принципу FIFO (first in - first out)
 * @author STAS
 * @version 1.0
 */
public class PriorityQueue {
    /**
     * Хранение задания осуществляется в коллекции типа LinkedList
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод принимает на вход заявку и добавляет ее в очередь.
     * Если встречаются 2 задания с одинаковым приоритетом, то в очереди
     * они распределяются по принципу FIFO.
     * @param task задача, которая добавляется в очередь
     */
    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (element.priority() > task.priority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод позволяет получить первую задачу в очереди
     * @return возвращает задачу из головы очереди или null если очередь пуста
     */
    public Task take() {
        return tasks.poll();
    }

    public static void main(String[] args) {
        var queue = new PriorityQueue();
        var task1 = new Task("to up", 5);
        var task2 = new Task("to up", 7);
        var task3 = new Task("to up", 514);
        var task4 = new Task("to up", 2);
        var task5 = new Task("to up", 309);
        var task6 = new Task("to up", 31);
        var task7 = new Task("to up", 3);
        var task8 = new Task("to up", 33);
        var task9 = new Task("to up", 3);

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
