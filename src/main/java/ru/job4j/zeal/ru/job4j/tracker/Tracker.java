package ru.job4j.zeal.ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] temp = new Item[size];
        int nameIndex = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                temp[nameIndex++] = items[i];
            }
        }
        return Arrays.copyOf(temp, nameIndex);
    }

    public  Item[] findAll() {
        Item[] temp = new Item[size];
        for (int i = 0; i < size; i++) {
            temp[i] = items[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        Item third = new Item("Third");
        tracker.add(first);
        tracker.add(new Item("Second"));
        tracker.add(second);
        tracker.add(third);
        tracker.add(new Item());
        tracker.add(new Item(25, "Broker"));

        for (Item item : tracker.findAll()) {
            System.out.println("id " + item.getId() + " name " + item.getName());
        }
        System.out.println();
        for (Item item : tracker.findByName("Second")) {
            System.out.println("id " + item.getId() + " name " + item.getName());
        }
    }
}