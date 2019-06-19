package com.vlad.Task2;

public class RusFilm implements Film {

    private String language = "Rus";

    private String name = "Петя Пяточкин";

    private double length = 1.45;


    @Override
    public void showName() {
        System.out.println("Name: " + this.name);
    }

    @Override
    public void showLength() {
        System.out.println("Lasts: " + this.length + " hours");
    }

    @Override
    public void checkLanguage() {


        System.out.println("Language: " + this.language);

    }

    @Override
    public void changeLanguage(String language) {
        this.language = language;
    }
}

