package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StartUITest {

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
        };
        StartUI.deleteItem(new StabInput(answers), tracker);
        Item deleted = item;
        assertThat(tracker.findById(deleted.getId())).isNull();
    }
}