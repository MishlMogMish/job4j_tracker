package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.*;

public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed() {
        return  new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return  new Iterable<String>() {
            public Iterator<String> iterator() {
                printInfo(words);
                List<String> shuffled = new ArrayList<>(Arrays.asList(words));
                printInfo(shuffled, " element: ");
                Collections.shuffle(shuffled, new Random(47));
                printInfo(shuffled, " shuffledEl: ");
                System.out.println();
                return shuffled.iterator();
            }
        };
    }

    public  void printInfo(Collection<String> collection, String colName) {
        for (String s : collection) {
            System.out.print(colName + s + " + hashcode: " + s.hashCode() + "   ;");
        }
        System.out.println();
    }

    public  void printInfo(String[] strings) {
        for (String s : strings) {
            System.out.print(" words[]: " + s + " + hashcode: " + s.hashCode() + "   ;");
        }
        System.out.println();
    }

    public static void printInfo(Integer[] integers) {
        for (Integer i : integers) {
            System.out.print(" " + i +  "   ;");
        }
        System.out.println();
    }

    public static void printInfo(Object[] obj) {
        for (Object o : obj) {
            System.out.print(" " + o + "   ;");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for (String s : mic.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(" Ok");
        for (String s : mic.randomized()) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(" Ok1");
        System.out.println();
        System.out.println("In base Array there is no shuffling at all: ");
        for (String s : mic) {
            System.out.print(s + " ");
        }
    }
}
