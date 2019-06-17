package com.vlad.Task4;

public class FigureI implements Shape {

    private double size = 4.1;

    @Override
    public void getSize(){
        System.out.println("SIZE: "+this.size);
    }

    @Override
    public void fall(){
        System.out.println("I-Figure is falling...");
    }

    @Override
    public void getBossFigure() {
        System.out.println("SUPER I-Figure is falling...");
        System.out.println("SIZE: " + 2*this.size);

    }
}
