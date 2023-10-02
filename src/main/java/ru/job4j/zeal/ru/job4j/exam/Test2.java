package ru.job4j.zeal.ru.job4j.exam;

public class Test2 extends Test1 {

    public static void test() {

        System.out.println("Hello from Test2");
    }

    public static void main(String[] args) {

        Test1 t = new Test2();

        t.test();
        System.out.println();
        Object[] objects = {22, "Иван", 45, 5.4, 3e22};
        for (int i = 1; i <= objects.length; i++) {
            String stringBegin = "Имя: %";
            String  stringEnd = "$s, возраст: %s, more: %3$s, moreMore: %s " + ", 22, \"Иван\", 45, 5.4, 3e22";
            String strResult = stringBegin + i + stringEnd;
            System.out.println(strResult);
            System.out.println();
            System.out.printf(strResult, 22, "Иван", 45, 5.4, 3e22);
            System.out.println();
            System.out.println();
            System.out.println();
        }
        System.out.printf("name : %s, age: %s", 22, "Ivan");
    }
}