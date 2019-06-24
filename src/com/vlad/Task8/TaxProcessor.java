package com.vlad.Task8;

public class TaxProcessor extends Processor {

    private int sumOfTax;

    private final int defaultTax=5;
    private final int subsidyTax=12;
    private final int stateTransferTax=7;

    private Transaction transaction;

    public TaxProcessor(Transaction transaction) {
        super(transaction);
        this.transaction = transaction;
    }


    @Override
    public void process() {
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

    }
}
