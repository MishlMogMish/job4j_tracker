package ru.job4j.tracker;

public class ValidatedInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        boolean unvalideted = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                unvalideted = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid data");
            }
        } while (unvalideted);
        return value;
    }
}
