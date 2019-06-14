package com.vlad.Task1;

class Value implements Computable {

    int value;

    public Value(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void print(int level) {

        for (int i = 0; i < level; i++)
            System.out.print("  ");
        System.out.println("Value " + value);
    }

}
