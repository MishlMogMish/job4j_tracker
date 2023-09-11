package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC", "Purify water", "Do lessons"};
        Input input = new StabInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item(1, "Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());

        Item created1 = tracker.findAll()[1];
        Item expected1 = new Item("Purify water");
        assertThat(created1.getName()).isEqualTo(expected1.getName());

        Item created2 = tracker.findAll()[2];
        Item expected2 = new Item(3, "Do lessons");
        assertThat(created2.getName()).isEqualTo(expected2.getName());
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "edited item"
        };
        StartUI.editItem(new StabInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        Item item1 = new Item("new item1");
        Item item2 = new Item("new item2");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        String[] answers = {
                String.valueOf(item1.getId()),
                String.valueOf(item.getId()),
                String.valueOf(item2.getId()),
        };
        StartUI.deleteItem(new StabInput(answers), tracker);
        Item deleted = item1;
        assertThat(tracker.findById(deleted.getId())).isNull();
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(item.getName());
        assertThat(tracker.findById(item2.getId()).getName()).isEqualTo(item2.getName());
    }
}