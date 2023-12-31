package ru.job4j.oop;

public class Local {
    private String name  = "Petr";

    public void getFullName() {
        final String surname = "Arsentev";

        class FullName {
            public void prntFullName() {
                System.out.println(name + " " + surname);
            }
        }

        FullName fullName = new FullName();
        fullName.prntFullName();
    }

    public static void main(String[] args) {
        Local local = new Local();
        local.getFullName();
    }
}
