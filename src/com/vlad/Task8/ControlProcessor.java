package com.vlad.Task8;

public class ControlProcessor implements Processor {

    private final int CREDITLIMIT = 100;

    private Transaction transaction;

    private Processor next;

    public void setNext(Processor next) {
        this.next = next;
    }


    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void process(Transaction transaction) {
        setTransaction(transaction);
        transaction.printType();
        if (transaction.getValue() <= 0) {
            System.out.println("Incorrect transaction");
        }

        if (transaction.getValue() > CREDITLIMIT) {
            System.out.println("Spending limit is crossed, incorrect transaction");
            this.next = null;
        } else System.out.println("Transaction is validated");

        System.out.println("Value: " + transaction.getValue());

        if (next != null) {
            next.process(this.transaction);
        }
    }


}
