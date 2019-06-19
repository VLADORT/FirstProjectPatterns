package com.vlad.Task5;

public abstract class Creature  {

    GameStrategy gameStrategy;

    public Creature(){}

    void doMove() {
        gameStrategy.move();
    }

    public void setStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }



}
