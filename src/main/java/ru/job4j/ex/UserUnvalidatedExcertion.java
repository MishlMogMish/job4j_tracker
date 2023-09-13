package ru.job4j.ex;

public class UserUnvalidatedExcertion extends UserNotFoundException {
    public UserUnvalidatedExcertion(String message) {
        super(message);
    }
}
