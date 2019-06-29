package com.vlad.PersonalTask;

public class Main {
    public static void main(String[] args) {

        Automate automate = new Automate();
        automate.getInfo();
        automate.makeOrder(3,"bread",2);
        automate.makeOrder(1,"chocolate",1);
        automate.inputMoney(105,58);
        automate.getPurchase();
        automate.getInfo();


    }
}
