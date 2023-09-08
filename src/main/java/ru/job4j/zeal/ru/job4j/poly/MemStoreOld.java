package ru.job4j.zeal.ru.job4j.poly;

public class MemStoreOld extends FileStoreOld {
    private String[] mem = new String[100];
    private int size = 0;

    public MemStoreOld() {
        super(null);
    }

    @Override
    public void save(String data) {
        mem[size++] = data;
        System.out.println("Saved data: memStore & don't open file Service.java!\n 0r smbd can imagine that it leeds to file storeing, not mem storeing\n - entaglment");
    }

    @Override
    public String read() {
        StringBuilder buff = new StringBuilder();
        for (int i = 0; i < size; i++) {
            buff.append(mem[i]);
        }
        return buff.toString();
    }
}
