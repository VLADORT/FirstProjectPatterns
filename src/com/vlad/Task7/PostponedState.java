package com.vlad.Task7;

public class PostponedState implements State {
    @Override
    public void next(Application app) {
        app.setState(new ConfirmedState());

    }

    @Override
    public void prev(Application app) {
        app.setState(new ConsideredState());

    }

    @Override
    public void check() {
        System.out.println("App is Postponed");
    }
}
