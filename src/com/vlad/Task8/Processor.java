package com.vlad.Task8;

public abstract class Processor {

    private Processor next;

    private Transaction transaction;

    public void setNext(Processor next) {
        this.next = next;
    }


    public Processor(Transaction transaction) {
        this.transaction = transaction;
    }


    public void processValue() {
        process();

        System.out.println("Value: " + transaction.getValue());

        if (next!=null) {
            next.processValue();
        }

    }

    abstract void process();

}
