package com.vlad.Task7;

public class ConsideredState implements State {


    @Override
    public void next(Application app) {
    if (app.getScore()>50) {
        app.setState(new ConfirmedState());
    }
    else if (app.getScore()==50) {
        app.setState(new PostponedState());

    }
    else {
        app.setState(new DeclinedState());

    }
    }

    @Override
    public void prev(Application app) {
        app.setState(new CreatedState());
    }



    @Override
    public void check() {
        System.out.println("Application is created and considered");
    }
}
