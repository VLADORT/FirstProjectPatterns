package com.vlad.Task7;

public class ConfirmedState implements State {


    @Override
    public void next(Application app) {

    }

    @Override
    public void prev(Application app) {
        app.setState(new ConsideredState());
    }



    @Override
    public void check() {
        System.out.println("App is confirmed");
    }
}
