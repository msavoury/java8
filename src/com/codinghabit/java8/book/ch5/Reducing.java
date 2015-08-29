package com.codinghabit.java8.book.ch5;

import com.codinghabit.java8.book.Apple;

import java.util.List;

/**
 * Created by msavoury on 8/29/15.
 */
public class Reducing {
    public static void main(String [] args) {
        reduceApple();
    }

    public static void reduceApple() {
        List<Apple> appleList = Apple.getListOfRandomApples(5);
        Apple superApple = appleList.stream().reduce(new Apple(),(a, b) -> new Apple(a.getWeight()+b.getWeight(), "super"));
        System.out.println(superApple);
    }
}
