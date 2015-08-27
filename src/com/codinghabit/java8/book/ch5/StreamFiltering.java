package com.codinghabit.java8.book.ch5;

import com.codinghabit.java8.book.Apple;

/**
 * Examples of using filters on the new Streams API
 */
public class StreamFiltering {
    public static void main(String[] args) {
        filtering1();

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
}
