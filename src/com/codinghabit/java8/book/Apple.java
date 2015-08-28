package com.codinghabit.java8.book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by msavoury on 8/10/15.
 */
public class Apple {

    static String[] names = {"red delicious", "pink", "granny smith", "gala", "ambrosia", "macintosh"};
    static String[] colors = {"red", "pink", "green", "yellow", "brown"};

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

    public static String getRandomAppleName() {
       int index = (int) (Math.random() * 100);
        //return names[index % names.length];
        return names[index % 2];
    }
    public static String getRandomAppleColor() {
        int index = (int) (Math.random() * 100);
        return colors[index % 2];
    }
    public static int getRandomAppleWeight() {
        int index = (int) (Math.random() * 10);
        return index;
    }
    public static Apple getRandomApple() {
        return new Apple(getRandomAppleWeight(), getRandomAppleColor(), getRandomAppleName());
    }
    public static List<Apple> getListOfRandomApples(int size) {
        if (size <= 0) throw new IllegalArgumentException("size must be greater than 0");
        List<Apple> apples = new ArrayList<>();
        while (size > 0) {
            apples.add(getRandomApple());
            size--;
        }
        return apples;
    }

    @Override
    public String toString() {
        return this.name + " " + this.color + " " + this.weight + "oz";
    }


}
