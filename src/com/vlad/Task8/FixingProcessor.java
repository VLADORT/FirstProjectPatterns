package com.vlad.Task8;

public class FixingProcessor extends Processor {

    private Transaction transaction;

    public FixingProcessor(Transaction transaction) {
        super(transaction);
        this.transaction=transaction;
    }




    @Override
    public void process() {
        transaction.printType();
        System.out.println("Transaction is detected");

    }



}
