package com.codinghabit.java8.book.ch3;

import com.codinghabit.java8.book.Apple;

import java.util.Comparator;
import java.util.List;

/**
 * Examples using the new features of the comparator
 * interface in java 8
 */
public class ComparatorPractice {
    public static void main(String[] args) {
        Comparator<Apple>  c = Comparator.comparing(Apple::getName);
        Comparator<Apple>  cReversed = c.reversed();
        Comparator<Apple>  cByWeight = Comparator.comparing(Apple::getWeight);

        //this is a combined comparator, sorting by name first then weight
        Comparator<Apple>  combined = c.thenComparing(cByWeight);

        List<Apple> apples = Apple.getAppleList();
        apples.sort(c);
        System.out.println("Printing sorted apples list");
        apples.forEach(a -> System.out.println(a.getName()));

        System.out.println("Printing sorted apples list reversed");
        apples.sort(cReversed);
        apples.forEach(a -> System.out.println(a.getName()));

        //doing it all inline
        apples.sort(Comparator.comparing(Apple::getColor).reversed());
    }
}
