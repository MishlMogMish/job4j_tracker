package ru.job4j.zeal.ru.job4j.ex;

import ru.job4j.ex.ElementNotFoundException;

public class FindEl {
    public static int indexOf(String[] values, String key) throws ru.job4j.ex.ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < values.length; i++) {
            if (key.equals(values[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ru.job4j.ex.ElementNotFoundException("Can not find key element in array");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        if (value.equals(abuses[0])) {
            throw new ElementAbuseException("Can't use " + abuses[0] + " it's an abuse from now on");
        }
        return true;
    }

    public static void proses(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ru.job4j.zeal.ru.job4j.ex.ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String key = "two";
        String[] numbers = {"five", "two", "three"};

        int index = 0;
        String[] abuses = {"two"};
        try {
            index = indexOf(numbers, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        proses(numbers, key, abuses);

        System.out.println(index);
    }
}
