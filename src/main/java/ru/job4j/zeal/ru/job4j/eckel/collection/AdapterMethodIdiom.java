package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<? extends T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<>() {
                    int curent = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return curent > -1;
                    }

                    @Override
                    public T next() {
                        return get(curent--);
                    }

                     @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                     }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(
                Arrays.asList("To be or not to be".split(" "))
        );
        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : ral.reversed()) {
            System.out.print(s + " ");
        }
    }
}
