package com.codinghabit.java8.book.ch5;

import com.codinghabit.java8.book.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Predicates
 * - allMatch
 * - anyMatch
 * - noneMatch
 *
 * - findFirst
 * - findAny
 */
public class FindingAndMatching {

    public static List<Integer> list =
            Arrays.asList(1,2,3,4,5,6);

    public static void main(String [] args) {
        allMatch();
        anyMatch();
        findFirst();
        findFirstApple();
    }

    public static void allMatch() {
        boolean allLessThan6 = list.stream().allMatch(i -> i < 6);
        System.out.println("Are all less than six? " + allLessThan6);
        boolean allLessThan10 = list.stream().allMatch(i -> i < 10);
        System.out.println("Are all less than ten? " + allLessThan10);
    }

    public static void anyMatch() {
        boolean atLeastOneIsDivisibleBy3 = list.stream().anyMatch(i -> i % 3 == 0);
        System.out.println("At least one div by 3? " + atLeastOneIsDivisibleBy3);
        boolean atLeastOneIsDivisibleBy8 = list.stream().anyMatch(i -> i % 8 == 0);
        System.out.println("At least one div by 8? " + atLeastOneIsDivisibleBy8);
    }

    /*
      Examples of using Optional
     */
    public static void findFirst() {
        Optional<Integer> theFirst7 = list.stream().filter(i -> i == 7).findFirst();
        if (theFirst7.isPresent()) {
            System.out.println("There is a 7");
        }
        else {
            System.out.println("There is no 7");
        }
    }

    public static void findFirstApple() {
        List<Apple> appleList = Apple.getListOfRandomApples(10);
        Optional<Apple> redApple = appleList.stream().filter(a -> a.getColor().equals("red")).findFirst();
        redApple.ifPresent(d -> System.out.println("The apple " + d + " is red"));
    }
}
