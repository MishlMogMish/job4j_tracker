package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    protected String[] words = ("And that is how "
            + "we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public  void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String string : new IterableClass()) {
            System.out.print(string + " ");
        }
    }
}
