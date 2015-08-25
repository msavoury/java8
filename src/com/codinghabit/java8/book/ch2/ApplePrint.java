package com.codinghabit.java8.book.ch2;

import com.codinghabit.java8.book.Apple;
import com.codinghabit.java8.book.ApplePredicate;
import java.util.List;

/**
 * Created by msavoury on 8/10/15.
 */
public class ApplePrint {

    public static void main(String args[]) {
        ApplePredicate printName = new ApplePredicate() {
            @Override
            public boolean test(Apple a) {
                System.out.println("Apple Name is " + a.getName());
                return false;
            }
        };

        ApplePredicate printColor = new ApplePredicate() {
            @Override
            public boolean test(Apple a) {
                System.out.println("Apple Color is " + a.getColor());
                return false;
            }
        };

        List<Apple> myApples = Apple.getAppleList();

        prettyPrintApple(myApples, printName);

        prettyPrintApple(myApples, printColor);
    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate aP) {
        for(Apple app : inventory) {
            aP.test(app);
        }
    }
}
