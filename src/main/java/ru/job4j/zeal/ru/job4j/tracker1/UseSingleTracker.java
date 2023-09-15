package ru.job4j.zeal.ru.job4j.tracker1;

public class UseSingleTracker {
    public static void main(String[] args) {
        Item item1 = new Item("name1");
        Item item2 = new Item("name2");
        Item item3 = new Item("name3");
        SingleTracker sTracker = SingleTracker.getInstance();
        sTracker.add(item1);
        sTracker.add(item2);
        sTracker.add(item3);
        Item[] items = sTracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println();
        sTracker.delete(2);
        items = sTracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
        
    }
}
