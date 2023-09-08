package ru.job4j.zeal.ru.job4j.varargs;

public class Varargs {
    public String text(String a) {
        return  "";
    }

    public String text(String a, String  b) {
        return  "";
    }

    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        return  builder.toString() + " \tNumber of concatinated strings: \n" + strings.length;
    }

    public static String textVarArg(String[] strings) {
        return  "VarArg";
    }

    public static void main(String[] args) {
        String[] strings = {"aaa", "bbb", "ccc"};
        String str = textVarArg(strings);
        System.out.println(str);
        System.out.println();

        System.out.println(text("aaaa", "cc", "vvv", "jfjfjfjfjfj", "ijoijboijnoijnoijnoijn"));
    }

}
