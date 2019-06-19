package com.vlad.Task5;


public class Client {


    public static void main(String[] args) {

        Group group = new Group();

        Creature bob = new Orc();
        Creature josh = new Pegasus();
        Creature felix = new Vampire();

        bob.doMove();
        josh.doMove();
        felix.doMove();

        group.add(bob);
        group.add(josh);
        group.add(felix);

        bob.doMove();
        josh.doMove();
        felix.doMove();
    }
}
