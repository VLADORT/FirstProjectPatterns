package com.vlad.Task2;


public class RusFilmFactory extends Factory {
    public Film getFilm() {
        return new RusFilm();
    }
}

