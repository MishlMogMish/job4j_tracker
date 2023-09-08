package ru.job4j.zeal.ru.job4j.poly;

public class FileStore implements Store {
private String path;

    public FileStore() {
    }

    public FileStore(String path) {
        this.path = path;
    }

    @Override
    public void save(String data) {
        System.out.println("Item has been saved in FileStore");
    }

    @Override
    public String read() {
        return null;
    }
}
