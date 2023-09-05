package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("\"Key\"", 134);
        Book book2 = new Book("\"Clean code\"", 632);
        Book book3 = new Book("\"Lost in space\"", 894);
        Book book4 = new Book("\"War and Peace\"", 1134);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println();
        System.out.println("Replace books[0] and books[3]");

        Book temp = new Book();
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println();
        System.out.println("Choose only \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
