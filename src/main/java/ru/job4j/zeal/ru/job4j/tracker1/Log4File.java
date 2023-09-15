package ru.job4j.zeal.ru.job4j.tracker1;

public final class Log4File {
    private static Log4File instance = null;
    private String[] messages = new String[1000];
    private int index = 0;

    private Log4File() {
    }

    public static Log4File getInstance() {
        if (instance == null) {
            instance = new Log4File();
        }
        return instance;
    }

    public void add(String message) {
        messages[index++] = message;
    }

    public void  save() {
        for (String message : messages) {
            if (message != null) {
                System.out.println(message);
            }
        }
    }

    public static void main(String[] args) {
        Log4File log = Log4File.getInstance();
        log.add("add new Item1");
        log.add("add new Item2");
        log.add("add new Item3");
        log.save();
    }
}
