package com.vlad.Task4;

public class Rectangle implements Shape {

    private double size = 4.2;

    @Override
    public void getSize(){
        System.out.println("SIZE: "+this.size);
    }

    @Override
    public void fall(){
        System.out.println("Rectangle is falling...");
    }

    @Override
    public void getBossFigure() {
        System.out.println("SUPER Rectangle is falling...");
        System.out.println("SIZE: " + 2*this.size);

    }
}
