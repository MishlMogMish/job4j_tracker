package ru.job4j.zeal.ru.job4j.exam.privatclass;

class Display {

    //Private nested or inner class
    private class InnerDisplay {
        private int deepField = 5;

        public void display() {
            System.out.println("Private inner class method called");
        }
    }

    void display() {
        System.out.println("Outer class (Display) method called");
        // Access the private inner class
        InnerDisplay innerDisplay = new InnerDisplay();
        innerDisplay.display();
        System.out.println(innerDisplay.deepField);
    }

    public static void main(String[] args) {
        // Create object of the outer class (Display)
        Display object = new Display();

        // method invocation
        object.display();
    }

}


