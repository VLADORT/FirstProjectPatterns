package com.vlad.Task7;

public class CreatedState implements State {


    @Override
    public void next(Application app) {
        app.setState(new ConsideredState());
    }

    @Override
    public void prev(Application app) {

        System.out.println("There is no previous state for CREATED");

    }

    @Override
    public void check() {
        System.out.println("App is created");
    }
}
