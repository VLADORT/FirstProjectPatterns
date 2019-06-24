package com.vlad.Task8;

public class ControlProcessor extends Processor {

    private final int CREDITLIMIT = 100;

    private Transaction transaction;

    public ControlProcessor(Transaction transaction) {
        super(transaction);
        this.transaction=transaction;
    }


    @Override
    public void process() {
        transaction.printType();
        if (transaction.getValue() <= 0) {
            System.out.println("Incorrect transaction");
        }

        if (transaction.getValue()>CREDITLIMIT) {
            System.out.println("Spending limit is crossed, incorrect transaction");
            System.exit(1);
        }
        else System.out.println("Transaction is validated");

    }


}
