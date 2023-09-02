package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error active: " + active);
        System.out.println("Error status: " + status);
        System.out.println("Error message: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 5, " out of memory");
        Error error3 = new Error(false, 45, " out of range");
        Error error4 = new Error(true, 4, " illegal parametre");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
        error4.printInfo();
    }
}
