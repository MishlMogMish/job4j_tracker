package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20,
                18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);

        priorityQueue = new PriorityQueue<>(
                ints.size(), Collections.reverseOrder()
        );
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringsPQ = new PriorityQueue<>(strings);
        QueueDemo.printQ(stringsPQ);

        stringsPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringsPQ.addAll(strings);
        QueueDemo.printQ(stringsPQ);

        Set<Character> charSet = new HashSet<>();
        for (char c : fact.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        QueueDemo.printQ(characterPQ);
        characterPQ = new PriorityQueue<>(charSet.size(), Collections.reverseOrder());
        characterPQ.addAll(charSet);
        QueueDemo.printQ(characterPQ);

        List<Character> factChar = new LinkedList<>();
        for (char c : fact.toCharArray()) {
            factChar.add(c);
        }
        characterPQ = new PriorityQueue<>(factChar);
        QueueDemo.printQ(characterPQ);

        characterPQ = new PriorityQueue<>(factChar.size(), Collections.reverseOrder());
        characterPQ.addAll(factChar);
        QueueDemo.printQ(characterPQ);

    }
}
