package com.vlad.Task8;

public class TaxProcessor implements Processor {

    private int sumOfTax;

    private final int defaultTax=5;
    private final int subsidyTax=12;
    private final int stateTransferTax=7;

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    private Transaction transaction;
    private Processor next;
    public void setNext(Processor next) {
        this.next = next;
    }



    @Override
    public void process(Transaction transaction) {
        setTransaction(transaction);
        transaction.printType();
        switch (transaction.getType()) {
            case "Subsidy transaction":
                sumOfTax = transaction.getValue() / subsidyTax;
                break;
            case "State transaction":
                sumOfTax = transaction.getValue() / stateTransferTax;
                break;
            case "Simple transaction":
                sumOfTax=transaction.getValue()/defaultTax;
                break;
        }




        transaction.setValue(transaction.getValue()-sumOfTax);

        System.out.println("Transaction is Taxed");
        System.out.println("Value: " + transaction.getValue());

        if (next != null) {
            next.process(this.transaction);
        }

    }
}
