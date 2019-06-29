package com.vlad.PersonalTask;

public class Main {
    public static void main(String[] args) {

        Automate automate = new Automate();
        automate.getInfo();
        automate.makeOrder(1,"bread",6);
        automate.makeOrder(2,"garlic",7);

        automate.inputMoney(200,58);
        automate.getPurchase();
        automate.getInfo();


    }
}
