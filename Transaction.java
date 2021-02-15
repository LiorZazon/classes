package com.company;

import lombok.ToString;

import java.util.Date;

@ToString
public class Transaction {

    /*
    class Transaction
final Date creationTime
final int transactionAmount
static average_amount
static amount_sum
static amount_count
ctor:
put the current date inside the creationTime
put amount (argument) into the transactionAmount
calculate average on each ctor

hint:
final Date creationTime = new Date()
     */

     public final Date transactionTime;
     public final int transaction_amount;

     public static int amount_count = 0;
     public static int amount_sum = 0;

     public static double averageTransaction() {
         return (double)amount_sum/amount_count;
     }

    public Transaction(int transaction_amount) {
        transactionTime = new Date();
        this.transaction_amount = transaction_amount;
        amount_count++;
        amount_sum += transaction_amount;
    }
}

