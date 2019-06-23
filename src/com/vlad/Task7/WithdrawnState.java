package com.vlad.Task7;

public class WithdrawnState implements State {



    @Override
    public void next(Application app) {
        this.check();
    }

    @Override
    public void prev(Application application) {
        this.check();
    }



    @Override
    public void check() {
        System.out.println("App is Withdrawn");
    }
}
