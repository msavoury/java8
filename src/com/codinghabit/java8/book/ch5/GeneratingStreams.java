package com.codinghabit.java8.book.ch5;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * This class provides examples of generarting streams
 * in various ways
 *  */
public class GeneratingStreams {

    public static void main(String [] args) {
        streamOfStrings();
    }

    public static void streamOfStrings(){
        Stream<String> strings = Stream.of("This", "is", "a", "test");
        strings.map(String::toUpperCase).forEach(System.out::println);
        Stream<String> emptyStream = Stream.empty();

        Consumer<Object> printer = System.out::println;

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6);
        integerStream.forEach(printer);
    }
}
