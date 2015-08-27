package com.codinghabit.java8.book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by msavoury on 8/10/15.
 */
public class Apple {
    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {return name;}

    private int weight;
    private String color;
    private String name;

    public Apple() {
        this(20, "green", "granny smith");
    }
    
    public Apple(int weight, String color) {
        this(weight, color, "default");
    }

    public Apple(int weight, String color, String name) {
        this.weight = weight;
        this.name = name;
        this.color  = color;
    }

    public static List<Apple> getAppleList() {
      List<Apple> appleList = new ArrayList<Apple>();

      appleList.add(new Apple(10, "red", "macintosh"));
      appleList.add(new Apple(17, "green", "granny smith"));
      appleList.add(new Apple(67, "green", "granny smith"));
      appleList.add(new Apple(47, "green", "granny smith"));
      appleList.add(new Apple(12, "pink", "pink lady"));
      appleList.add(new Apple(12, "pink", "ambrosia"));
      appleList.add(new Apple(12, "green", "pink lady"));
      appleList.add(new Apple(108, "yellow", "gala"));
      appleList.add(new Apple(108, "red", "honeycrisp"));
      appleList.add(new Apple(17, "yellow", "gala"));
      appleList.add(new Apple(34, "red", "red delicious"));
      appleList.add(new Apple(44, "red", "red delicious"));
      return appleList;
    }

    public static Apple makeApple() {
        return new Apple(23, "red", "red");
    }

    public static void processApples(Consumer<Apple> consumer, List<Apple> apples) {
        for(Apple a : apples) {
            consumer.accept(a);
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.color + " " + this.weight + "oz";
    }


}
