package com.codinghabit.java8.book.ch4;

import com.codinghabit.java8.book.Apple;

import java.util.List;
import static java.util.stream.Collectors.toList;
import static java.lang.System.out;

/**
 * First example of using Streams
 */
public class StreamsExample {

    public static void main(String[] args) {
        List<Apple> appleList = Apple.getAppleList();
        List<Apple> smallApples = appleList.stream().filter((a)-> a.getWeight() < 19).collect(toList());
        List<Apple> redApples = appleList.stream().filter((a) -> a.getColor().equalsIgnoreCase("red")).collect(toList());

        System.out.println("\n== Collecting small apples:");
        Apple.processApples((a)-> {out.println(a);}, smallApples);
        
        System.out.println("\n== Collecting red apples:");
        Apple.processApples((a)-> {out.println(a);}, redApples);
    }
}
