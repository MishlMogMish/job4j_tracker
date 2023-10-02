package ru.job4j.zeal.ru.job4j.exam;

public class TestInstanceOf {

    private String name;

    private String hello;

    public TestInstanceOf(String name) {
        this.name = name;
    }

    public String getHello() {
        return hello;
    }

    public static void main(String[] args) {

        System.out.println((new TestInstanceOf("name").getHello() instanceof String));

    }

}
