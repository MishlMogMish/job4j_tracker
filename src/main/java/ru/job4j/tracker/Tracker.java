package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int trackIndex = indexOf(id);
        return trackIndex != -1 ? items.get(trackIndex) : null;
    }

    public List<Item> findByName(String key) {
        List<Item> tempList = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                tempList.add(item);
            }
        }
        return tempList;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public boolean replace(int id, Item item) {
        int trackIndex = indexOf(id);
        boolean rsl = trackIndex >= 0;
        if (rsl) {
            item.setId(id);
            items.set(trackIndex, item);
        }
        return rsl;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
        }
    }

    private int indexOf(int id) {
        int rsl = -1;
        int index = 0;
        for (Item it : items) {
            if (it.getId() == id) {
                rsl = index;
                break;
            }
            index++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Item item = new Item(23, "smth1");
        Item item2 = new Item(23, "smth2");
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(item);
        tracker.add(item2);
        System.out.println(tracker.findById(1));
        item1.setName("smthChanged");
        System.out.println(tracker.findById(1));
        System.out.println(tracker.findAll());
        List<Item> items = tracker.findAll();
        Item changingItem = items.get(1);
        changingItem.setName("double Changed");
        System.out.println(tracker.findAll());
    }
}