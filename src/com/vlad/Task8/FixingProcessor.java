package com.vlad.Task8;

public class FixingProcessor implements Processor {

    private Transaction transaction;
    private Processor next;
    public void setNext(Processor next) {
        this.next = next;
    }






    @Override
    public void process(Transaction transaction) {
        setTransaction(transaction);
        transaction.printType();
        System.out.println("Transaction is detected");
        System.out.println("Value: " + transaction.getValue());

        if (next != null) {
            next.process(this.transaction);
        }

    }


    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
