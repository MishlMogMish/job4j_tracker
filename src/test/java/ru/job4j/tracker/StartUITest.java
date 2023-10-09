package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StabInput(
                new String[]{"0", "Item name", "1"}
        );
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new CreateAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName()).isEqualTo("Item name");
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
        List<UserAction> actions = List.of(
                new ReplaceAction(out),
                new ExitAction(out)
        );
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
        List<UserAction> actions = List.of(
                new DeleteAction(out),
                new ExitAction(out)
        );
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
        List<UserAction> actions = List.of(
                new ShowAllAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu: " + ln
                        + "0. Show all Items" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + two + ln
                        + "Menu: " + ln
                        + "0. Show all Items" + ln
                        + "1. Exit Program" + ln
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
        List<UserAction> actions = List.of(
                new ReplaceAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu: " + ln
                        + "0. Edit Item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu: " + ln
                        + "0. Edit Item" + ln
                        + "1. Exit Program" + ln
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
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        List<UserAction> actions = List.of(
                new FindByIdAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu: " + ln

                        + "0. Find Item by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find item by id ===" + ln
                        + one + ln
                        + "Menu: " + ln
                        + "0. Find Item by id" + ln
                        + "1. Exit Program" + ln
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
                new String[]{"0", one.getName(), "1"}
        );
        List<UserAction> actions = List.of(
                new FindByNameAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu: " + ln
                        + "0. Find Item by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ===" + ln
                        + one + ln
                        + "Menu: " + ln
                        + "0. Find Item by name" + ln
                        + "1. Exit Program" + ln
                        + "Выход из программы ..." + ln
        );
    }

    @Test
    public void whenInvalidInputThenValidatedAndExit() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[]{"7", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu: " + ln
                        + "0. Exit Program" + ln
                        + "Wrong input, you can select: 0 .. " + (actions.size() - 1) + ln
                        + "Menu: " + ln
                        + "0. Exit Program" + ln
                        + "Выход из программы ..." + ln
        );
    }
}