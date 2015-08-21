package com.codinghabit.java8.book.ch3;

import com.codinghabit.java8.Apple;

import java.util.function.Supplier;

/**
 * This file showcases some usages of method references. 
 */
public class MethodReferences {

    public static void main(String [] args) {
        //First example we'll use a lambda as an argument,
        //we've seen this before
        takeReference(() -> new Apple(1, "test", "test"));

        //Now for the method reference:
        takeReference(Apple::makeApple);
    }

    public static void takeReference(Supplier<Apple> supplier) {
        Apple a = supplier.get();
        System.out.println(a);
    }
}
