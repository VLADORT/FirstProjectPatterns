package com.vlad.Task8;

public class StateTransaction implements Transaction {

    @Override
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;

    public StateTransaction(int value) {
        this.value = value;
    }

    private String type = "State transaction";



    public String getType() {
        return this.type;
    }
    @Override
    public void printType() {
        System.out.println("Type: " + type);
    }
}
