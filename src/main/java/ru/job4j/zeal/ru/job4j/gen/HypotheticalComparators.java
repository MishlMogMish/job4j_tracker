package ru.job4j.zeal.ru.job4j.gen;

import java.util.function.Function;
import java.util.Comparator;

/**
 * Пример шаблонов super & extend для обобщенных типов из
 * <a href=
 * "https://stackoverflow.com/questions/49124391/java-8-comparator-comparing-static-function/49124661#49124661">...</a>
 *
 * @author Andrey Tyukin
 * @version 1.0
 */
class HypotheticalComparators {

    public static <A, B> Comparator<A> badCompare1(Function<A, B> f, Comparator<B> cb) {
        return (A a1, A a2) -> cb.compare(f.apply(a1), f.apply(a2));
    }

    public static <A, B> Comparator<A> badCompare2(Function<? super A, B> f, Comparator<B> cb) {
        return (A a1, A a2) -> cb.compare(f.apply(a1), f.apply(a2));
    }

    public static <A, B> Comparator<A> badCompare3(Function<A, ? extends B> f, Comparator<B> cb) {
        return (A a1, A a2) -> cb.compare(f.apply(a1), f.apply(a2));
    }

    public static <A, B> Comparator<A> goodCompare(Function<? super A, ? extends B> f, Comparator<B> cb) {
        return (A a1, A a2) -> cb.compare(f.apply(a1), f.apply(a2));
    }

    public static void main(String[] args) {
        Car1 car1 = new Car1(455);
        Car1 car2 = new Car1(1955);
        PhysicalObject physicalObject = new PhysicalObject(3076);

        Function<PhysicalObject, PositiveReal> weight = p -> new PositiveReal(p.weight);

        Comparator<Real> realComparator = (Real r1, Real r2) -> {
            double v1 = r1.getValue();
            double v2 = r2.getValue();
            return Double.compare(v2, v1);
        };
        Function<PhysicalObject, Real> surrealWeight = p -> new Real(p.weight);
        Comparator<Car1> goodComparator = goodCompare(weight, realComparator);
        Comparator<Car1> goodComparator2 = goodCompare(surrealWeight, realComparator);
        Comparator<PhysicalObject> goodComparator1 = goodCompare(weight, realComparator);
        System.out.println(goodComparator1.compare(car1, physicalObject));
        System.out.println(goodComparator.compare(car2, car1));
        System.out.println(goodComparator2.compare(car2, car1));

        Comparator<Car1>  comparingComparator =  Comparator.comparing(weight);
        System.out.println();
        System.out.println("op op");
        System.out.println(comparingComparator.compare(car2, car1));

        /**
         * bad "weight"-function that cannot guarantee that the outputs
         * are positive
         */

        /**
         * bad weight function that works only on cars
         * Note: the implementation contains nothing car-specific,
         * it would be the same for every other physical object!
         * That means: code duplication!
         */
        Function<Car1, PositiveReal> carWeight = p -> new PositiveReal(p.weight);
/**
 *          Example 1
 *          badCompare1(weight, realComparator); // doesn't compile
 *          type error:
 *          required: Function<A,B>,Comparator<B>
 *          found: Function<PhysicalObject,PositiveReal>,Comparator<Real>
 *
 *          Example 2.1
 *          Comparator<Car> c2 = badCompare2(weight, realComparator); // doesn't compile
 *
 *          type error:
 *          required: Function<? super A,B>,Comparator<B>
 *          found: Function<PhysicalObject,PositiveReal>,Comparator<Real>
 *
 *          Example 2.2
 *          This compiles, but for this to work, we had to loosen the output
 *          type of `weight` to a non-necessarily-positive real number
 */
        Comparator<Car1> c22 = badCompare2(surrealWeight, realComparator);

        /**
         * Example 3.1
         *         This doesn't compile, because `Car` is not *exactly* a `PhysicalObject`:
         *         Comparator<Car> c3_1 = badCompare3(weight, realComparator);
         *
         *          incompatible types: inferred type does not conform to equality constraint(s)
         *          inferred: Car
         *          equality constraints(s): Car,PhysicalObject
         *
         *          Example 3.2
         *          This works, but with a bad code-duplicated `carWeight` instead of `weight`
         */

        Comparator<Car1> c32 = badCompare3(carWeight, realComparator);
/**
 *   Example 4
 *   That's how it's supposed to work: compare cars by their weights. Done!
 */
    }
}
