package ru.job4j.zeal.ru.job4j.tracker1;

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
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Please enter valid data");
            }
        } while (invalid);
        return value;
    }
}
