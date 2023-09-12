package ru.job4j.tracker;

public class StartUI {

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        tracker.delete(id);
        Item item = tracker.findById(id);
        System.out.println(item == null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
    }

        public void init(Input input, Tracker tracker, UserAction[] actions) {
            boolean run = true;
            while (run) {
                showMenu();
                int select = input.askInt("Select: ");
                run = actions[select].execute(input, tracker);
            }
        }

        private void showMenu() {
            String[] menu = {
                    "Add new Item", "Show all items", "Edit item",
                    "Delete item", "Find item by id", "Find item by name",
                    "Exit Program"
            };

            System.out.println("Menu: ");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + ". " + menu[i]);
            }
        }

        public static void main(String[] args) {
            Input input = new ConsoleInput();
            Tracker tracker = new Tracker();
            UserAction[] actions = {
              new CreateAction(), new ShowAllAction(),
                    new ReplaceAction(), new DeleteAction(),
                    new FindByIdAction(), new FindByNameAction(),
                    new Exit()
            };
            new StartUI().init(input, tracker, actions);
        }
    }
