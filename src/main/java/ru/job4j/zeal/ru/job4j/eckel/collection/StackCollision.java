package ru.job4j.zeal.ru.job4j.eckel.collection;

public class StackCollision {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String string : " My dog has fleas".split(" ")) {
            stack.push(string);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        java.util.Stack<String> stack2 = new java.util.Stack<>();
        for (String string : " My dog has fleas".split(" ")) {
            stack2.push(string);
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
