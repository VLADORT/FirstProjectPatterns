package com.vlad.Task1;

public class Division extends Operation {
    public Division(Calculator left, Calculator right) {
        super(left, right);
    }

    @Override
    public double compute() {
        if (right.compute() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return left.compute() / right.compute();
    }
}
