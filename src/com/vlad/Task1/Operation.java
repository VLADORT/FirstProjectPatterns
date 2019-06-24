package com.vlad.Task1;

public abstract class Operation implements Calculator  {

    public Calculator left;
    public Calculator right;

    public Operation(Calculator left, Calculator right) {
        this.left = left;
        this.right = right;
    }
}
