package com.vlad.Task10;

import java.util.Random;

public class Main {
    private static Random random = new Random();

    private static String[] lethality = {"lethal", "non-lethal", "dependent"};
    private static String[] form = {"bacilla", "spirilla", "cocus"};
    private static String[] usage = {"useless", "useful"};


    public static String getLethality() {
        return lethality[random.nextInt(lethality.length)];
    }

    public static String getUsage() {
        return usage[random.nextInt(usage.length)];
    }

    public static String getForm() {
        return form[random.nextInt(form.length)];
    }

    public static void main(String[] args) throws InterruptedException {
        FlyweightFactory factory = new FlyweightFactory();
        for (int i = 0; i < 20; i++) {
            Bacteria bacterium = factory.getBacteria(getForm(),getUsage(),getLethality());

            if (bacterium != null) {
                System.out.println("Bacterium " + (i + 1));
                bacterium.addToColonia();
            } else {
                i--;
                Thread.sleep(1000);
            }
        }
    }
}
