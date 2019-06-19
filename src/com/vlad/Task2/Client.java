package com.vlad.Task2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String[] films = {"John Wick","Петя Пяточкин"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Available movies:");
        for (String filmName: films
        ) {
            try {

                Factory.getFactory(filmName).getFilm().showName();
                Factory.getFactory(filmName).getFilm().checkLanguage();
            }
            catch (MovieNotInStockException e) {
                System.out.println("Internal error");
            }

        }
        System.out.println("Input movie name");
        String filmName = scanner.nextLine();


        Factory factory;
        try {
            factory = Factory.getFactory(filmName);

            Film film = factory.getFilm();
            film.checkLanguage();
            film.showName();
            film.showLength();



        } catch (MovieNotInStockException e) {
            System.err.println("Invalid input!");
        }

        scanner.close();
    }
}
