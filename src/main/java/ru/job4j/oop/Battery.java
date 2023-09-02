package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
        int sum = this.load + another.load;

        if (sum >= 100) {
            this.load = sum - 100;
            another.load = 100;
        } else {
            another.load = sum;
            this.load = 0;
        }
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(30);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about() + "\n");
        first.exchange(second);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about() + "\n");
    }
}
