package com.vlad.Task4;

public class Square implements Shape {


    private double size = 2.2;

    @Override
    public void getSize() {
        System.out.println("SIZE: " + this.size);
    }

    @Override
    public void fall() {
        System.out.println("Square is falling...");
    }

    @Override
    public void getBossFigure() {
        System.out.println("SUPER Square is falling...");
        System.out.println("SIZE: " + 2*this.size);

    }

}
