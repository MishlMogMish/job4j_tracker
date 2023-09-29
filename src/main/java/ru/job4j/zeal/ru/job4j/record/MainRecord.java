package ru.job4j.zeal.ru.job4j.record;

public class MainRecord {

    public static void main(String[] args) {
        Student student = new Student("Mike", 15);
        System.out.println(student.name() + student.age());
        PersonContacts contacts =
                new PersonContacts("Nike", 34,
                        new PersonContacts.Contact("sss@mail.ru", "8--999-333-2323"));
        System.out.println(contacts.contact().getEmail());
        System.out.println(contacts.contact().getPhone());
        System.out.println(contacts.name());
        System.out.println(contacts.age());

        Book book = new Book("Ups&happy", "Life.All",
                new Book.Edition() {
                    @Override
                    public String getName() {
                        return "one more life";
                    }
                });
        System.out.println();
        System.out.println(book.author());
        System.out.println(book.title());
        System.out.println(book.edition().getName());
        System.out.println();

        Somebody somebody = new Somebody("Hike", 45);
        somebody.print();
    }
}

