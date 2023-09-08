package ru.job4j.zeal.ru.job4j.poly;

public class ServiceOld {
    private FileStoreOld store;

    public ServiceOld() {
    }

    public ServiceOld(FileStoreOld store) {
        this.store = store;
    }

    public void add() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        FileStoreOld store = new FileStoreOld(new String("path"));
        ServiceOld serviceOld = new ServiceOld(store);
        serviceOld.add();
        System.out.println();

        MemStoreOld store1 = new MemStoreOld();
        ServiceOld serviceOld1 = new ServiceOld(store1);
        serviceOld1.add();
    }
}
