package com.codinghabit.java8.book.ch5;

import com.codinghabit.java8.MyUtils;
import static java.util.stream.Collectors.toList;

import java.util.List;

/**
 * Examples using map and flat map
 */
public class MappingExample {

    public static void main(String [] args) {

    }

    public static void simpleMap() {
        List<Integer> list1 = MyUtils.generateIntList(10);
        List<Integer> listDoubles = list1.stream()
                                        .map((i) -> i * 2)
                                        .collect(toList());
    }

    public static void doubleMap() {
        List<Integer> list1 = MyUtils.generateIntList(10);
        List<Integer> list2 = MyUtils.generateIntList(10);
        List<Integer> sum = list1.stream()
                                    .flatMap((i) -> list2.stream()
                                                        .map(j -> (int)(j * i))
                                        ).collect(toList());
    }
}
