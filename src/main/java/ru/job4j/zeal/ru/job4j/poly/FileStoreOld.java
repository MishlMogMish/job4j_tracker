package ru.job4j.zeal.ru.job4j.poly;

public class FileStoreOld {
    private String path;

    public FileStoreOld(String path) {
        this.path = path;
    }

    public void save(String data) {
        System.out.println("Saved data: " + data);
    }

    public String read() {
        return  null;
    }
}
