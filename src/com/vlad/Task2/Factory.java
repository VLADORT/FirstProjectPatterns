package com.vlad.Task2;


public abstract class Factory {
    /*Singelton factory objects*/
    private static Factory engFilmFactory = null;
    private static Factory rusFilmFactory = null;

    public abstract Film getFilm();


    public static Factory getFactory(String name)
            throws MovieNotInStockException {

        if (name == null) {
            return null;
        }

        Factory factory = null;
        switch (name) {
            case "John Wick":
                if (engFilmFactory == null)
                    engFilmFactory = new EngFilmFactory();
                factory = engFilmFactory;
                break;
            case "Петя Пяточкин":
                if (rusFilmFactory == null)
                    rusFilmFactory = new RusFilmFactory();
                factory = rusFilmFactory;
                break;
            default:
                throw new MovieNotInStockException();
        }

        return factory;
    }
}


