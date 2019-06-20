package com.vlad.Task6;

import java.util.ArrayList;
import java.util.Arrays;

public class PostOffice implements Cast {
    private ArrayList<Magazine> magazines;
    private ArrayList<Observer> observers;

    PostOffice() {
        magazines = new ArrayList<>();
        observers = new ArrayList<>();
    }


    public ArrayList<Magazine> getState() {
        return magazines;
    }

    public void addMagazine(Magazine... values) {
        magazines.addAll(Arrays.asList(values));
        Notify();
    }


    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void Notify() {
        for (int i = 0; i < observers.size(); i++)
            observers.get(i).update(this);
    }
}
