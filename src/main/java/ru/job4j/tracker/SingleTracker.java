package ru.job4j.tracker;

public final class SingleTracker {
    private  static Tracker tracker = new Tracker();
    private static SingleTracker instance = null;

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public void delete(int id) {
        tracker.delete(id);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findByName(String name) {
        return tracker.findByName(name);
    }

    public static void main(String[] args) {
        SingleTracker singleTracker = new SingleTracker();
        Item item = new Item("try");
        Item item1 = new Item("try1");
        Item item2 = new Item("try2");
        ConsoleOutput output = new ConsoleOutput();
        Item[] items;
        singleTracker.add(item);
        singleTracker.add(item1);
        singleTracker.add(item2);
        items = singleTracker.findAll();
        for (Item it : items) {
            output.println(it);
        }
    }
}

