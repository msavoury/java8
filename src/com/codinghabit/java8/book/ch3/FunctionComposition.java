package com.codinghabit.java8.book.ch3;

import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * Examples of function composition.
 */
public class FunctionComposition {
    public static void main(String [] args) {
        useAndThen();
        useCompose();
    }

    /*
     * Examples of using .andThen to compose functions
     */
    public static void useAndThen() {
        Function<Integer, Integer> add1 = (i) -> i + 1;
        Function<Integer, Integer> add2 = (i) -> i + 2;
        Function add3 = add1.andThen(add2);

        System.out.println(add3.apply(1)); // prints 4

        Function<Integer, Integer> mul3 = (i) -> i * 3;

        //multiply by 3 then add 1
        System.out.println(mul3.andThen(add1).apply(1));

        //add 1 then multiply by 3
        System.out.println(add1.andThen(mul3).apply(1));

    }

    public static void useCompose() {
        Function<Integer, Integer> add4 = (i) -> i + 4;
        Function<Integer, Integer> add2 = (i) -> i + 2;
        Function add6 = add4.andThen(add2);

        //Each of the following examples print '9'
        System.out.println(add4.compose(add2).apply(3));
        System.out.println(add2.compose(add4).apply(3));
        System.out.println((add6).apply(3));

        Function<Integer, Integer> mul2 = (i) -> i * 2;

        System.out.println(mul2.compose(add4).apply(4)); // 16
        System.out.println(add4.compose(mul2).apply(4)); // 12

    }
}
