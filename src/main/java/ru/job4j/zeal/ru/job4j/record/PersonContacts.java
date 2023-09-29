package ru.job4j.zeal.ru.job4j.record;

public record PersonContacts(String name, int age, Contact contact) {

    public static class Contact {

        private final String email;
        private final String phone;

        public Contact(String email, String phone) {
            this.email = email;
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }
    }
}