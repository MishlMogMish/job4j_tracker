package ru.job4j.zeal.ru.job4j.pipeline;

public class ConvertToCharArrayHandler implements Handler<String, char[]> {
    @Override
    public char[] process(String input) {
        System.out.println("Convert to char Array : " + input);
        return  input.toCharArray();
    }
}
