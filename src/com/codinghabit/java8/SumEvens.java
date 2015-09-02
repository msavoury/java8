package com.codinghabit.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by msavoury on 9/2/15.
 */
public class SumEvens {
    public static void main(String [] args) {
        sumEvens(IntStream.rangeClosed(1,10).toArray());
    }

    public static void sumEvens(int [] nums) {
        int sum = Arrays.stream(nums).filter(i -> i % 2 == 0).sum();
        System.out.println("Sum is " + sum);
    }
}
