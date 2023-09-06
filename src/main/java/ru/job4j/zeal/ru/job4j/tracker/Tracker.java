package ru.job4j.zeal.ru.job4j.tracker;

import ru.job4j.tracker.Item;

import java.util.Arrays;

public class Tracker {
    private final ru.job4j.tracker.Item[] items = new ru.job4j.tracker.Item[100];
    private int ids = 1;
    private int size = 0;

    public ru.job4j.tracker.Item add(ru.job4j.tracker.Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public ru.job4j.tracker.Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public ru.job4j.tracker.Item[] findByName(String key) {
        ru.job4j.tracker.Item[] temp = new ru.job4j.tracker.Item[size];
        int nameIndex = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                temp[nameIndex++] = items[i];
            }
        }
        return Arrays.copyOf(temp, nameIndex);
    }

    public ru.job4j.tracker.Item[] findAll() {
        ru.job4j.tracker.Item[] temp = new ru.job4j.tracker.Item[size];
        for (int i = 0; i < size; i++) {
            temp[i] = items[i];
        }
        return temp;
    }

    public boolean replace(int id, ru.job4j.tracker.Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            items[index].setId(id);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - 1 - index);
            items[size - 1] = null;
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        ru.job4j.tracker.Item item1 = new ru.job4j.tracker.Item("a");
        ru.job4j.tracker.Item item2 = new ru.job4j.tracker.Item("b");
        ru.job4j.tracker.Item item3 = new ru.job4j.tracker.Item("c");
        ru.job4j.tracker.Item item4 = new ru.job4j.tracker.Item("d");
        ru.job4j.tracker.Item item5 = new ru.job4j.tracker.Item("e");
        ru.job4j.tracker.Item item6 = new ru.job4j.tracker.Item("f");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        tracker.add(item6);

        for (int i = 0; i < tracker.size; i++) {
            System.out.println(tracker.items[i].getName() + "\t  " + tracker.items[i].getId());
        }
        System.out.println();

        tracker.replace(3, new Item("1001"));
        for (int i = 0; i < tracker.size; i++) {
            System.out.println(tracker.items[i].getName() + "\t  " + tracker.items[i].getId());
        }
        System.out.println();

        boolean del = tracker.delete(5);
        for (int i = 0; i < tracker.size; i++) {
            System.out.println(tracker.items[i].getName() + "\t  " + tracker.items[i].getId() + "  " + del);
        }
        System.out.println();

        del = tracker.delete(85);
        for (int i = 0; i < tracker.size; i++) {
            System.out.println(tracker.items[i].getName() + "\t  " + tracker.items[i].getId() + "  " + del);
        }
    }
}