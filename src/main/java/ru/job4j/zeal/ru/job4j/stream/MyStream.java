package ru.job4j.zeal.ru.job4j.stream;

import java.util.function.Function;
import java.util.stream.Stream;

public interface MyStream<T> {

    Stream<T> myStream();

    static <T> MyStream<T> of(Stream<T> stream) {
        return () -> stream;
    }

    default <U> MyStream<U> myStream(Function<Stream<T>, Stream<U>> stream) {
        return of(stream.apply(myStream()));
    }

    /**
     * Watch out with Double cast. Check the type in method or restrict it via generic
     */

    default MyStream<T> biggerThanFour() {
        return of(myStream().filter(i -> ((Double) i > 4)));
    }

    /**
     * //Watch out with Double cast. Check the type in method or restrict it via generic
     * //Another method
     *
     */

    default MyStream<T> biggerThanTen() {
        return of(myStream().filter(i -> ((Double) i > 10)));
    }

    static void main(String[] args) {
        of(Stream.of(1.0, 3.0, 7.0, 2.0, 9.0))
                .biggerThanFour()
                .myStream(doubleStream -> doubleStream.map(aDouble -> aDouble * 2))
                .biggerThanTen()
                .myStream()
                .mapToInt(Double::intValue)
                .forEach(System.out::println);
    }
}