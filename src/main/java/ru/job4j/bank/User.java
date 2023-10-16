package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс представляет модель данных клиента банка
 * @author Mik
 * @version 1.0
 */
public class User {
    /**
     *  Паспорт клиента банка
     */
    private String passport;
    /**
     * Имя клиента банка
     */
    private String username;

    /**
     * Конструктор класса
     * @param passport паспорт клиента банка
     * @param username имя клиента банка
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод
     * @return возвращает паспорт клиента
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод позволяет ввести паспорт клиента
     * @param passport паспорт клиента
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод для получения имени клиента
     * @return возвращает имя клиента
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод для ввода имени клиента
     * @param username имя клиента банка
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод позволяет узнать являются ли клиенты банка одним и тем же человеком.
     * Сравнение происходит только по паспорту
     * @param o клиент банка представленный классом User
     * @return возвращает true если паспорт другого клиента банка совпадает с паспортом
     * данного клиента.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод hashCode переопределен при переопределении метода equal,
     * чтобы равные объекты имели одинаковые хэшкоды
     * @return хешкод согласованный с equal
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
