package ru.job4j.zeal.ru.job4j.lambda;

public class ConstructorRefMain {
    public static void main(String[] args) {
        FunctionalInterface modelConstructor = Model::new;
        Model mod = modelConstructor.function("op-pa");
        System.out.println("как бы так: " + mod.getName());
    }
}
