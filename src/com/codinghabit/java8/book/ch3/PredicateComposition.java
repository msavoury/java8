package com.codinghabit.java8.book.ch3;

import com.codinghabit.java8.Apple;

import java.util.List;
import java.util.function.*;

/**
 * Examples of composing predicates
 */
public class PredicateComposition {
    public static void main(String[] args) {
        List<Apple> appleList = Apple.getAppleList();
        Predicate<Apple> isRed = (a) -> a.getColor().equalsIgnoreCase("red");
        //Choosing red apples
        appleList.forEach(ap -> appleTaker(isRed, ap));
        //Choosing non-red apples
        appleList.forEach(apple -> appleTaker(isRed.negate(), apple));

        fizzBuzz(15);
    }

    public static void appleTaker(Predicate<Apple> predicate, Apple a) {
        if (predicate.test(a)) {
            System.out.println("Apple " + a.getName() + " passes!");
        }
        else {
            System.out.println("Apple " + a.getName() + " does not pass." );
        }
    }

    public static void takeOne(Apple a) {
        System.out.println(a);
    }

    public static void fizzBuzz(int max) {
        IntPredicate isDiv3 = (i) -> i % 3 == 0;
        IntPredicate isDiv5 = (i) -> i % 5 == 0;

        for (int i = 0; i <= max; i++) {
            if (isDiv3.and(isDiv5).test(i)) {
                System.out.println("FizzBuzz");
            }
            else if (isDiv3.test(i)){
                System.out.println("Fizz");
            }
            else if (isDiv5.test(i)) {
                System.out.println("Buzz");
            }
            else {
                System.out.println( i + " is just " +i);
            }
        }
    }

}
