package ru.job4j.queue;

import java.util.Deque;
import java.util.LinkedList;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        Deque<Character> tempDeque = new LinkedList<>(evenElements);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < evenElements.size(); i++) {
            if (i % 2 == 0) {
                sb.append(tempDeque.pollFirst());
                continue;
            }
            tempDeque.pollFirst();
        }
        return sb.toString();
    }

    private String getDescendingElements() {
        Deque<Character> tempDeque = new LinkedList<>(descendingElements);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < descendingElements.size(); i++) {
            sb.append(tempDeque.pollLast());
        }
        return sb.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
