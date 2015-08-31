package com.codinghabit.java8.book.ch5;

import com.codinghabit.java8.book.Apple;

import java.util.Arrays;
import java.util.List;

/**
 * Created by msavoury on 8/29/15.
 */
public class Reducing {
    public static void main(String [] args) {

        reduceApple();
        reduceAsSum();
    }

    public static void reduceApple() {
        List<Apple> appleList = Apple.getListOfRandomApples(5);
        Apple superApple = appleList.stream().reduce(new Apple(),(a, b) -> new Apple(a.getWeight()+b.getWeight(), "super"));
        System.out.println(superApple);
    }

    /*
     * Take a list of ints and reduce to a sum of the elements
     */
    public static void reduceAsSum() {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = myInts.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum is " + sum);
    }


}
