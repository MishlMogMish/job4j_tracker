package ru.job4j.zeal.ru.job4j.joshua.streams;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

public class Mersen {
    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }

    public static void main(String[] args) {
        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .limit(20)
                .forEach(System.out::println);

       Stream<BigInteger> bI = primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersen -> mersen.isProbablePrime(50))
                .limit(10);

        for (BigInteger bigInteger : iterableOf(bI)) {
            System.out.println(bigInteger);
        }
    }

    public static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }
}
