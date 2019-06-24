package com.vlad.Task1;

public class Multiplication extends Operation {
    public Multiplication(Calculator left, Calculator right) {
        super(left, right);
    }

    @Override
    public double compute() {
        return left.compute() * right.compute();
    }

}
