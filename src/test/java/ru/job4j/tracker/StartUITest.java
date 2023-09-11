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
        Item expected1 = new Item(2, "Purify water");
        assertThat(created1.getName()).isEqualTo(expected1.getName());

        Item created2 = tracker.findAll()[2];
        Item expected2 = new Item(3, "Do lessons");
        assertThat(created2.getName()).isEqualTo(expected2.getName());
    }
}