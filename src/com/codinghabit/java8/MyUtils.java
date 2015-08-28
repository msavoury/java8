package com.codinghabit.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class
 */
public class MyUtils {
    /**
     * Return list of ints of given size
     * @param listSize
     * @return
     */
    public static List<Integer> generateIntList(int listSize) {
        List<Integer> list = new ArrayList<>();
        while(listSize > 0) {
            list.add((int)(Math.random() * 100));
            listSize--;
        }
        return list;
    }
}
