package com.vlad.Task4;

public class FigureZ implements Shape {

    private double size = 4.2;

    @Override
    public void getSize(){
        System.out.println("SIZE: "+this.size);
    }

    @Override
    public void fall(){
        System.out.println("Z-Figure is falling...");
    }

    @Override
    public void getBossFigure() {
        System.out.println("SUPER Z-Figure is falling...");
        System.out.println("SIZE: " + 2*this.size);

    }
}
