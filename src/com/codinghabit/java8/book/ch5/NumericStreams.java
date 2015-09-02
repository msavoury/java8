package com.codinghabit.java8.book.ch5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Example of using a numeric stream
 * - use mapToInt to convert to an IntStream
 * - use .boxed() to convert back
 */
public class NumericStreams {

    public static void main(String[]args) {
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

        //using mapToInt
        int transactionSum = transactions.stream().mapToInt(Transaction::getValue).sum();
        System.out.println("Transaction sum is " + transactionSum);

        OptionalDouble transactionAverage = transactions.stream().mapToInt(Transaction::getValue).average();
        System.out.println("Transaction average is " + transactionAverage);

        int[] values = IntStream.rangeClosed(1, 100).toArray();
    }
}
