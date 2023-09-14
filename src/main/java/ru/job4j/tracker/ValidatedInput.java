package ru.job4j.tracker;

public class ValidatedInput implements Input {
    private final Output out;
    private  final Input in;

    public ValidatedInput(Output out, Input in) {
        this.out = out;
        this.in = in;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean unvalidated = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                unvalidated = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid data");
            }
        } while (unvalidated);
        return value;
    }
}
