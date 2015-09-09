package com.codinghabit.java8.book.ch5;

import com.codinghabit.java8.book.Apple;

import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class provides examples of generating streams
 * in various ways
 *  */
public class GeneratingStreams {

    public static void main(String [] args) {
        streamOfStrings();
        streamOfApples();
    }

    public static void streamOfStrings(){
        Stream<String> strings = Stream.of("This", "is", "a", "test");
        strings.map(String::toUpperCase).forEach(System.out::println);
        Stream<String> emptyStream = Stream.empty();

        Consumer<Object> printer = System.out::println;

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6);
        integerStream.forEach(printer);

        IntStream myStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
        myStream.map(i -> (i * 4));
        //myStream.forEach(System.out::println);
    }

    public static void streamOfApples() {
        Stream<Apple> appleStream = Stream.of(new Apple(), new Apple());
        int totalAppleWeight = appleStream.mapToInt(Apple::getWeight).sum();
        System.out.println(totalAppleWeight);
    }
}
