package ru.job4j.zeal.ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Status Toyota: " + toyota);
        System.out.println("Status Volvo: " + volvo);
        System.out.println();

        Order order = new Order(1, "Volvo", Status.IN_WORK);
        System.out.println(order);
        System.out.println();

        for (Status s : Status.values()) {
            System.out.println(s.name() + "  " + s.ordinal() + "  "
                    + s.getInfo() + " " + s.getMessage());
        }
    }
}
