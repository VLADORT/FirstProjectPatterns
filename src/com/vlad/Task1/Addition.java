package com.vlad.Task1;

public class Addition extends Operation {

    public Addition(Calculator left, Calculator right) {
        super(left, right);
    }

    @Override
    public double compute() {
        return left.compute() + right.compute();
    }

}
