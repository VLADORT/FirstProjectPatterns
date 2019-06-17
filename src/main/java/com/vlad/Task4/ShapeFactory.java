package com.vlad.Task4;

public class ShapeFactory {

    public Shape getFigure(String number)
            throws ShapeNotFoundException {

        if (number == null)
            return null;
        Shape figure = null;
        switch (number) {
            case "1":
                figure = new FigureI();
                break;
            case "2":
                figure = new Rectangle();
                break;
            case "3":
                figure = new Square();
                break;
            case "4":
                figure = new FigureZ();
                break;
            default:
                throw new ShapeNotFoundException();
        }
        return figure;
    }
}
