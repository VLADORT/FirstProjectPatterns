package com.vlad.Task6;

public class Main {
    public static void main(String[] args) {

        PostOffice postOffice = new PostOffice();

        Client bob = new Client("bob");
        Client jon = new Client("jon");
        Client lol = new Client("lol");

        Magazine magazine1 = new Magazine("jon", "About Cars");
        Magazine magazine2 = new Magazine("bob", "About Animals");


        postOffice.addObserver(lol);
        postOffice.addObserver(jon);

        postOffice.addMagazine(magazine1, magazine2);
    }

}
