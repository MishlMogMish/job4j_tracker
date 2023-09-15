package ru.job4j.zeal.ru.job4j.tracker1;

public class StabInput implements Input {
    private String[] answers;
    private int count;

    public StabInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[count++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
