package com.vlad.Task1;

public class Subtraction extends Operation {
    public Subtraction(Calculator left, Calculator right) {
        super(left, right);
    }

    @Override
    public double compute() {
        return left.compute() - right.compute();
    }
}
