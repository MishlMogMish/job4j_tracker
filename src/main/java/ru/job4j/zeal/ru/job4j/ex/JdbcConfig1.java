package ru.job4j.zeal.ru.job4j.ex;

public class JdbcConfig1 {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
    }

    public static void main(String[] args) throws UserInputException {
        String str = null;
            load(str);
    }
}
