package com.vlad.Task8;

public class Main {

    public static void main(String[] args) {
        Transaction transaction = new SimpleTransaction(101);
        Transaction transaction1 = new SubsidyTransaction(80);


        Processor processor1 = new FixingProcessor();
        Processor processor2 = new ControlProcessor();
        Processor processor3 = new TaxProcessor();


        processor1.setNext(processor2);
        processor2.setNext(processor3);
        processor1.process(transaction);




        processor1.setNext(processor2);
        processor2.setNext(processor3);
        processor1.process(transaction1);


    }
}
