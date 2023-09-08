package ru.job4j.zeal.ru.job4j.concat;

import java.util.StringJoiner;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String str = "Job4j";
        for (int i = 0; i < 9999; i++) {
            str += i;
        }
        System.out.println("Миллисекунд String: " + (System.currentTimeMillis() - startTime));
        System.out.println();

        startTime = System.currentTimeMillis();
        StringBuilder strBuild = new StringBuilder("Job4j");
        for (int i = 0; i < 9999; i++) {
            strBuild.append(i);
        }
        System.out.println("Миллисекунд StringBuilder: " + (System.currentTimeMillis() - startTime));
        System.out.println(strBuild);
        System.out.println();

        startTime = System.currentTimeMillis();
        StringBuffer strBuff = new StringBuffer("Job4j");
        for (int i = 0; i < 9999; i++) {
            strBuff.append(i);
        }
        System.out.println("Миллисекунд StringBuffer: " + (System.currentTimeMillis() - startTime));
        System.out.println(strBuff);
        System.out.println();

        StringBuilder str1 = new StringBuilder("abc");
        str1.append("def").append("ghijk");
        System.out.println(str1);
        System.out.println();

        startTime = System.currentTimeMillis();
         str = "Job4j";
        for (int i = 0; i < 9999; i++) {
            str = str.concat("abc");
        }
        System.out.println("Миллисекунд String.concat: " + (System.currentTimeMillis() - startTime));
        System.out.println(str);
        System.out.println();

        startTime = System.currentTimeMillis();
        String str2 = "Job4j";
        for (int i = 0; i < 9999; i++) {
            str2 = String.join(" ", str2, "abc");
        }
        System.out.println("Миллисекунд String.join: " + (System.currentTimeMillis() - startTime));
        System.out.println(str2);
        System.out.println();

        StringJoiner stringJoiner = new StringJoiner("; ", "-->", "<--");
        for (int i = 0; i < 10; i++) {
            stringJoiner.add("abc");
        }
        System.out.println(stringJoiner);
        System.out.println();

        String str3 = "Job4j";
        for (int i = 0; i < 9999; i++) {
            stringJoiner.add(str3);
        }
        System.out.println("Миллисекунд StringJoiner: " + (System.currentTimeMillis() - startTime));
        System.out.println(stringJoiner);
        System.out.println();

    }
}
