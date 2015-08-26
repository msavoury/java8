package com.codinghabit.java8.book.ch4;

import com.codinghabit.java8.book.Apple;

import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * First example of using Streams
 */
public class StreamsExample {

    public static void main(String[] args) {
        List<Apple> appleList = Apple.getAppleList();
        List<Apple> smallApples = appleList.stream().filter((a)-> a.getWeight() > 20).collect(toList());

    }
}
