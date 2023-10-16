package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета
 * @author Mik
 * @version 1.0
 */
public class Account {
    /**
     * Поле для символьной идентификации счета
     */
    private String requisite;
    /**
     * Сумма на счету
     */
    private double balance;

    /**
     * Конструктор класса
     * @param requisite  реквизиты
     * @param balance баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     *
     * Метод возвращает реквизиты счета
     * @return реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод устанавливает реквизиты счета
     * @param requisite реквизиты
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает сумму на счете
     * @return сумма на счету
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод устанавливает суму на счету
     * @param balance сумма на счету
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод определяет равенство разных счетов в том и только в том случае
     * если у них одинаковые реквизиты
     * @param o другой счет класса Account
     * @return возвращает true если реквизиты равны и false если не равны
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод определяет новый хэшкод для согласования с равенством объектов Account
     * @return возвращает код вычисляемый на основе только реквизитов счета
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
