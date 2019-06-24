package com.vlad.Task8;

public class Main {

    public static void main(String[] args) {
        Transaction transaction = new SimpleTransaction(101);
        Transaction transaction1 = new SubsidyTransaction(80);


        Processor processor1 = new FixingProcessor(transaction);
        Processor processor2 = new ControlProcessor(transaction);
        Processor processor3 = new TaxProcessor(transaction);


        processor1.setNext(processor2);
        processor2.setNext(processor3);
        processor1.processValue();

        processor1 = new FixingProcessor(transaction1);
        processor2 = new ControlProcessor(transaction1);
        processor3 = new TaxProcessor(transaction1);

        processor1.processValue();

        processor1.setNext(processor2);
        processor2.setNext(processor3);
        processor1.processValue();


    }
}
