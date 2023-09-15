package ru.job4j.ex;

import java.util.Random;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("No such user in the list of users");
        }

        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3
                || !user.isValid()) {
            throw new UserInvalidException("The user login is invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Abc", true),
                new User("Xyz", false),
                new User("CD", true)
        };
        String[] logins = {"Xyz", "Petr Arsentev", "Santa", "Ab", "CD"};
        Random rand = new Random();
        int index = rand.nextInt(0, logins.length);

        try {
            System.out.println(logins[index] + " asks to get access");
            if (validate(findUser(users, logins[index]))) {
                System.out.println("Access granted for: " + logins[index]);
            }
        } catch (UserInvalidException eui) {
            eui.printStackTrace();
        } catch (UserNotFoundException eunf) {
            eunf.printStackTrace();
        }
    }
}
