package com.vlad.Task2;

public class EngFilm implements Film {
    private String language = "Eng";

    private String name = "John Wick";

    private double length = 2.15;


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
