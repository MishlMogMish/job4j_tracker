package ru.job4j.zeal.ru.job4j.tracker1;

import ru.job4j.tracker.ConsoleInput;
import ru.job4j.tracker.ConsoleOutput;
import ru.job4j.tracker.CreateAction;
import ru.job4j.tracker.DeleteAction;
import ru.job4j.tracker.ExitAction;
import ru.job4j.tracker.FindByIdAction;
import ru.job4j.tracker.FindByNameAction;
import ru.job4j.tracker.Input;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.ReplaceAction;
import ru.job4j.tracker.ShowAllAction;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;
import ru.job4j.tracker.ValidatedInput;

public class StartUI {
    private final ru.job4j.tracker.Output out;

    public StartUI(ru.job4j.tracker.Output out) {
        this.out = out;
    }

    public void init(ru.job4j.tracker.Input input, ru.job4j.tracker.Tracker tracker, ru.job4j.tracker.UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. "
                        + (actions.length - 1));
                continue;
            }
            run = actions[select].execute(input, tracker);
        }
    }

    private void showMenu(ru.job4j.tracker.UserAction[] actions) {
        out.println("Menu: ");
        for (int i = 0; i < actions.length; i++) {
            out.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidatedInput(output, new ConsoleInput());
        ru.job4j.tracker.Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output), new ShowAllAction(output),
                new ReplaceAction(output), new DeleteAction(output),
                new FindByIdAction(output), new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
    }
}
