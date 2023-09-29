package ru.job4j.zeal.ru.job4j.object.finalize;

public class Cat {

    private String name;
    public static int counter;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public static void main(String[] args) throws Throwable {

        for (int i = 0; i < 10_000_000; i++) {

            Cat cat = new Cat();
            cat = null;
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Объект Cat уничтожен!");
        System.out.println(counter++);
    }
}