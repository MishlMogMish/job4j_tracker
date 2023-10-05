package ru.job4j.zeal.ru.job4j.exam.privatclass;

public class Display {

    private class InnerDisplay {
        private int deepField = 5;

        public void display() {
            System.out.println("Private inner class method called");
        }
    }

    void display() {
        System.out.println("Outer class (Display) method called");
        InnerDisplay innerDisplay = new InnerDisplay();
        innerDisplay.display();
        System.out.println(innerDisplay.deepField);
    }

    public static void main(String[] args) {
        Display object = new Display();

        object.display();
    }
}


