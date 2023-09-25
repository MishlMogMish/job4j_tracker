package ru.job4j.zeal.ru.job4j.shildt.java9;

public class RectTest {
    int[] values;
    static int stat = 9;

    public RectTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i != 0) {
            printArray(i - 1);
            System.out.println("[" + (i - 1) + "]" + values[i - 1]);
        }
    }
}

class Reccurcion {
    public static void main(String[] args) {
        RectTest ob = new RectTest(10);
        int i;
        for (i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);
        System.out.println(RectTest.stat);
    }
}
