package com.vlad.Task10;

import java.util.Timer;
import java.util.TimerTask;


public class Bacteria {
    private final int lifespan=4;
    String lethality;
    String form;
    String usage;
    String breed;


    boolean active;


    public Bacteria(String breed) {
        this.breed = breed;
    }

    public void setProperties(String form, String usage, String lethality) {
        this.form = form;
        this.usage = usage;
        this.lethality = lethality;

    }


    public boolean isActive() {
        return this.active;
    }

    void getInfo() {
        System.out.printf("BACTERIA: %s[1], ACTIVE: %s, LETHALITY %s, USAGE: %s", this.breed, this.active, this.lethality, this.usage);

    }

    public void addToColonia() throws InterruptedException {

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                active = false;
                getInfo();
            }
        }, lifespan*1000);
        active = true;

    }

}
