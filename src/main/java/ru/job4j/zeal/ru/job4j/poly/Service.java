package ru.job4j.zeal.ru.job4j.poly;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        Store store = new FileStore();
        Service service = new Service(store);
        service.add();
        System.out.println(store.getClass() + " < --- Class of store");
        System.out.println();

        store =  new MemStore();
        service = new Service(store);
        service.add();
        System.out.println(store.getClass() + " < --- Class of store");

    }
}
