package com.vlad.Task2;

public class EngFilmFactory extends Factory {
    public Film getFilm() {
        return new EngFilm();
    }

}
