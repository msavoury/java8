package com.codinghabit.java8.book.ch5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by msavoury on 9/2/15.
 */
public class Section55Practice {
    public static void main(String [] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1. Find all transactions in year 2011 and sort by value
        transactions.stream().filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

        //2. What are all the unique cities where the traders work?
        transactions.stream().map(t -> t.getTrader().getCity()).distinct().forEach(System.out::println);

        //3.Find all traders from Cambridge and sort them by name
        transactions.stream().map(t-> t.getTrader())
                .distinct()
                .filter(t -> t.getCity().equalsIgnoreCase("cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        //4. Return a string of all traders names sorted alphabetically
        String names = transactions.stream().map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (a, b) -> a + b);
        System.out.println(names);

        //5. Are any traders based in Milan
        boolean inMilan = transactions.stream()
                .map(t -> t.getTrader())
                .anyMatch(t -> t.getCity().equalsIgnoreCase("milan"));
        System.out.println("Any traders based in Milan? " + inMilan);

        //6. Print all transactions' values from the traders living in Cambridge
        transactions.stream().filter(t -> t.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .forEach(t -> System.out.println(t.getValue()));

        //7. What's the highest value of all the transactions
        int max = transactions.stream().map(t -> t.getValue())
                    .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Max value of transactions is "  + max);

        //8. Find transaction with he smallest value
        int min = transactions.stream().map(t -> t.getValue())
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Min value of transactions is "  + min);

    }
}
