package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StabInput(
                new String[]{"0", "Item name", "1"}
        );
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced name"));
        Output out = new ConsoleOutput();
        String replacedName = "New item name";
        Input in = new StabInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StabInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        Output out = new ConsoleOutput();
        UserAction[] actions = {
                new DeleteAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }

    @Test
    public void whenShowAllTestOutputIsSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = new Item("test1");
        Item two = new Item("test2");
        tracker.add(one);
        tracker.add(two);
        Input in = new StabInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ShowAllAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu: " + ln
                        + "0. Add new Item" + ln
                        + "1. Show all items" + ln
                        + "2. Edit item" + ln
                        + "3. Delete item" + ln
                        + "4. Find item by id" + ln
                        + "5. Find item by name" + ln
                        + "6. Exit Program" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + two + ln
                        + "Menu: " + ln
                        + "0. Add new Item" + ln
                        + "1. Show all items" + ln
                        + "2. Edit item" + ln
                        + "3. Delete item" + ln
                        + "4. Find item by id" + ln
                        + "5. Find item by name" + ln
                        + "6. Exit Program" + ln
                        + "Выход из программы ..." + ln
        );
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StabInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ReplaceAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu: " + ln
                        + "0. Add new Item" + ln
                        + "1. Show all items" + ln
                        + "2. Edit item" + ln
                        + "3. Delete item" + ln
                        + "4. Find item by id" + ln
                        + "5. Find item by name" + ln
                        + "6. Exit Program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu: " + ln
                        + "0. Add new Item" + ln
                        + "1. Show all items" + ln
                        + "2. Edit item" + ln
                        + "3. Delete item" + ln
                        + "4. Find item by id" + ln
                        + "5. Find item by name" + ln
                        + "6. Exit Program" + ln
                        + "Выход из программы ..." + ln
        );
    }

    @Test
    public void whenFindByIdTestOutputIsSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = new Item("test1");
        Item two = new Item("test2");
        tracker.add(one);
        tracker.add(two);
        Input in = new StabInput(
                new String[]{"0", "1", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByIdAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu: " + ln
                        + "0. Add new Item" + ln
                        + "1. Show all items" + ln
                        + "2. Edit item" + ln
                        + "3. Delete item" + ln
                        + "4. Find item by id" + ln
                        + "5. Find item by name" + ln
                        + "6. Exit Program" + ln
                        + "=== Find item by id ===" + ln
                        + one + ln
                        + "Menu: " + ln
                        + "0. Add new Item" + ln
                        + "1. Show all items" + ln
                        + "2. Edit item" + ln
                        + "3. Delete item" + ln
                        + "4. Find item by id" + ln
                        + "5. Find item by name" + ln
                        + "6. Exit Program" + ln
                        + "Выход из программы ..." + ln
        );

    }

    @Test
    public void whenFindByNameTestOutputIsSuccessful() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = new Item("test1");
        Item two = new Item("test2");
        tracker.add(one);
        tracker.add(two);
        Input in = new StabInput(
                new String[]{"0", "test1", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByNameAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu: " + ln
                        + "0. Add new Item" + ln
                        + "1. Show all items" + ln
                        + "2. Edit item" + ln
                        + "3. Delete item" + ln
                        + "4. Find item by id" + ln
                        + "5. Find item by name" + ln
                        + "6. Exit Program" + ln
                        + "=== Find items by name ===" + ln
                        + one + ln
                        + "Menu: " + ln
                        + "0. Add new Item" + ln
                        + "1. Show all items" + ln
                        + "2. Edit item" + ln
                        + "3. Delete item" + ln
                        + "4. Find item by id" + ln
                        + "5. Find item by name" + ln
                        + "6. Exit Program" + ln
                        + "Выход из программы ..." + ln
        );
    }
}