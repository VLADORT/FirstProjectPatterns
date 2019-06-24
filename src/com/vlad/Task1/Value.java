package com.vlad.Task1;

public class Value implements Calculator {
    private double value;

    public Value(Double value) {
        this.value = value;
    }

    @Override
    public double compute() {
        return value;
    }
}
