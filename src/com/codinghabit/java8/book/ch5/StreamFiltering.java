package com.codinghabit.java8.book.ch5;

import com.codinghabit.java8.book.Apple;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
/**
 * Examples of using filters on the new Streams API
 */
public class StreamFiltering {
    public static void main(String[] args) {
        //filtering1();
        //filtering2();
        ////usingDistinct();
        //usingLimit();
        usingSkip();
    }

    /*
     *  An example of using the 'filter' intermediate operation
     *  several times on the same stream.
     */
    public static void filtering1() {
        System.out.println("Filtering 1");
        Apple.getAppleList()
                .stream()
                .filter(a -> a.getColor().equalsIgnoreCase("red"))
                .filter(a -> a.getWeight() > 20)
                .forEach(System.out::println);
    }

    public static void filtering2() {
        System.out.println("filtering 2");
        int sum = 0;
        Apple.getAppleList().stream()
                .filter(a -> a.getWeight() < 40)
                .filter(a -> a.getName().contains("a"))
                .forEach(System.out::println);
    }

    public static void usingDistinct() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }


    public static void usingLimit() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .limit(3)
                .forEach(System.out::println);
    }

    public static void usingSkip() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
