package ru.job4j.zeal.ru.job4j.stream;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Multi {
    void processSerializable(Serializable ser, Consumer<String> consumer) {
        if (ser instanceof String str) {
            consumer.accept(str);
        } else if (ser instanceof List) {
            for (Serializable s : (List<Serializable>) ser) {
                processSerializable(s, consumer);
            }
        }
    }

    static Serializable arr(Serializable... elements) {
        return (Serializable) Arrays.asList(elements);
    }

    public static void main(String[] args) {
        Multi multi = new Multi();

        Stream.of(arr("A", "B"), "C", "D", arr(arr("E"), "F"), "G")
                .mapMulti(multi::processSerializable)
                .forEach(System.out::print);

        System.out.println();

        int sum = IntStream.of(2, 4, 6, 8)
                .reduce(5, Integer::sum);

        int product = IntStream.range(1, 10)
                .filter(x -> x % 4 == 0)
                .reduce((acc, x) -> acc * x)
                .orElse(56);
        System.out.println(product);

    }
}
