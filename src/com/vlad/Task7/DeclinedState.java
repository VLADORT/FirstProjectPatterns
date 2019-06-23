package com.vlad.Task7;

public class DeclinedState implements State {
    @Override
    public void next(Application app) {

    }

    @Override
    public void prev(Application app) {
        app.setState(new ConsideredState());
    }

    @Override
    public void check() {
        System.out.println("App is declined");
    }
}
