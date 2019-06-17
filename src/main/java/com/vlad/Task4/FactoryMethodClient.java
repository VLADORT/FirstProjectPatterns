package com.vlad.Task4;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class FactoryMethodClient {

    public static void main(String[] args) {

// Инициализируем генератор
        Random rnd = new Random(System.currentTimeMillis());
// Получаем случайное число в диапазоне от min до max (включительно)


        while (true) {

            int number = 1 + rnd.nextInt(4);
            int superFigure = 5 + rnd.nextInt(9);

            ShapeFactory factory = new ShapeFactory();

            try {
                // create an appropriate vehicle based on the input
                if (superFigure == 7) {
                    Shape shape = factory.getFigure(String.valueOf(number));
                    shape.getBossFigure();
                } else {

                    Shape shape = factory.getFigure(String.valueOf(number));
                    shape.fall();
                    shape.getSize();
                }
                sleep(2000);
            } catch (ShapeNotFoundException e) {
                System.out.println("Internal error");
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }

    }

}
