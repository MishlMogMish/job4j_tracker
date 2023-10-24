package ru.job4j.zeal.ru.job4j.eckel.collection;

public class StackTest2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            System.out.print(stack.pop() + " ");
        }

    }
}
