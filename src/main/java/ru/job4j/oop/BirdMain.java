package ru.job4j.oop;

public class BirdMain {
    public static void main(String[] args) {
        Bird anonimusParrot = new Bird() {
            @Override
            public void fly() {
                System.out.println("Попугай анонимно летит над лужайкой" + flyInside());
            }

            public String flyInside() {
                return " Анонимный попугай анонимно летает внутри анонимного класса";
            }
        };

        Bird bird = new Bird();
        Parrot notAnonimusParrot = new Parrot();

        bird.fly();
        notAnonimusParrot.fly();
        anonimusParrot.fly();
    }
}
