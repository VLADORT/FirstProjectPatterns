package com.vlad.PersonalTask;

public class Main {
    public static void main(String[] args) {

        Automate automate = new Automate();
        automate.getInfo();
        automate.makeOrder(1, "bread", 5);
        automate.makeOrder(2, "garlic", 5);

        automate.inputMoney(1000, 58);
        automate.getPurchase();
        System.out.println("=======================================================");
        automate.makeOrder(3,"garlic",1);
        automate.makeOrder(3,"chocolate",1);
        automate.inputMoney(60,0);
        automate.getPurchase();
        automate.returnMoney();
        System.out.println("=======================================================");

        automate.getInfo();

        automate.secretButton();
    }
}
