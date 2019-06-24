package com.vlad.Task8;

public class SubsidyTransaction implements  Transaction {


    @Override
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;

    public SubsidyTransaction(int value) {
        this.value = value;
    }

    private String type = "Subsidy transaction";

    public String getType() {


        return this.type;

    }
    @Override
    public void printType() {
        System.out.println("Type: " + type);
    }
}
