package com.vlad.Task7;

public class Application {

    private final int THRESHOLDSCORE = 50;

    private int score;

    public void setState(State state) {
        this.state = state;
    }

    public void withdraw() {
        this.setState(new WithdrawnState());
    }

    public State getState() {
        return state;
    }

    private State state = new CreatedState();

    public Application(int score) {
        this.score = score;
    }

    public void previousState() {
        state.prev(  this);
    }

    public void nextState() {
        state.next(this);
    }

    public void checkStatus() {
        state.check();
    }


    public int getScore() {
        return score;
    }


}
