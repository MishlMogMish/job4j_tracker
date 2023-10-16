package ru.job4j.ex;

import ru.job4j.ex.UserInputException;

public class FindEl {
    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < values.length; i++) {
            if (key.equals(values[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Can not find key element in array");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String key = "four";
        String[] numbers = {"one", "two", "three"};

        int index = 0;
        try {
            index = indexOf(numbers, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(index);
    }
}
