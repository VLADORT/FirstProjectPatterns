package com.vlad.Task8;

public class SimpleTransaction implements Transaction {


    public int getValue() {
        return value;
    }

    private int value;

    SimpleTransaction(int value) {
        this.value = value;
    }

    private String type = "Simple transaction";

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void printType() {
        System.out.println("Type: " + type);
    }
}
