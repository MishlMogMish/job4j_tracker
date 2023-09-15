package ru.job4j.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {
            "qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can not be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password length should be [8, 32]");
        }

        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                hasUpCase = true;
            }
            if (Character.isLowerCase(symbol)) {
                hasLowCase = true;
            }
            if (Character.isDigit(symbol)) {
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(symbol)) {
                hasSpecial = true;
            }
        }
        if (!hasUpCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one uppercase letter");
        }
        if (!hasLowCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one lowercase letter");
        }
        if (!hasDigit) {
            throw new IllegalArgumentException(
                    "Password should contain at least one digit");
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException(
                    "Password should contain at least one special symbol");
        }
        if (isForbiddenSubString(password)) {
            throw new IllegalArgumentException(
                    "Password shouldn't contain substrings: "
                            + "qwerty, 12345, password, admin, user");
        }
        return password;
    }

    private static boolean isForbiddenSubString(String password) {
        boolean rsl = false;
        StringBuilder sb = new StringBuilder();
        sb.append(password.toLowerCase());
        for (String string : FORBIDDEN) {
            if (sb.indexOf(string) != -1) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}