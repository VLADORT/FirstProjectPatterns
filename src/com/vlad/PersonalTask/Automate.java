package com.vlad.PersonalTask;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Automate {

    private double sum = 0;

    private ArrayList<Purchase> purchases = new ArrayList<>();
    private Purchase purchase = new Purchase();


    private ArrayList<Tray> trays;
    private ArrayList<Observer> observers;

    Automate() {
        Tray tray1 = new Tray();
        Tray tray2 = new Tray();
        Tray tray3 = new Tray();
        Tray tray4 = new Tray();
        Tray tray5 = new Tray();
        trays = new ArrayList<>();
        observers = new ArrayList<>();
        trays.addAll(Arrays.asList(tray1, tray2, tray3, tray4, tray5));
    }


    public void makeOrder(int numberOfTray, String good, int amount) {
        purchase = new Purchase();
        purchase.setProcessingTray(trays.get(numberOfTray-1));
        purchase.setAmount(amount);

        switch (good.toLowerCase()) {
            case "bread": {
                System.out.println("Bread, amount: " + amount);
                purchase.setGood(purchase.getProcessingTray().getBread());
                purchase.setRequiredMoney(purchase.getProcessingTray().getBread().getPrice() * purchase.getAmount());
                break;
            }
            case "chocolate": {
                System.out.println("Chocolate, amount: " + amount);
                purchase.setGood(purchase.getProcessingTray().getChocolate());
                purchase.setRequiredMoney(purchase.getProcessingTray().getChocolate().getPrice() * purchase.getAmount());
                break;
            }
            case "garlic": {
                System.out.println("Garlic, amount: " + amount);
                purchase.setGood(purchase.getProcessingTray().getGarlic());
                purchase.setAmount(amount);
                purchase.setRequiredMoney(purchase.getProcessingTray().getGarlic().getPrice() * purchase.getAmount());
                break;
            }
            default:
                System.out.println("Wrong good input");
                System.exit(1);
        }
        sum+=purchase.getRequiredMoney();
        purchases.add(purchase);
        System.out.println("Sum of purchase: " + sum);
    }


    public synchronized void inputMoney(int cash, int coins) {
        purchase.setInputMoney((double) cash + (double) coins / 100);
        System.out.println("Your money: " + purchase.getInputMoney());
    }

    public synchronized void getPurchase() {
        if (purchase.getInputMoney() < sum) {
            System.out.println("Not enough money for purchase");
        } else {
            for (Purchase purchase:
                 purchases) {

            purchase.getProcessingTray().getGood(purchase.getGood().getName()).update(purchase.getAmount());
            }
            System.out.println("Cash back: " + (new DecimalFormat(".00").format(purchase.getInputMoney() - sum)));
            System.out.println("Take your order");
        }
        purchase = null;

    }

    public void returnMoney() {
        if (purchase!=null){
            purchases= new ArrayList<>();
            purchase = null;
            System.out.println("Get your money back");
        }
        else  {
            System.out.println("Cannot return money after transaction");
        }
    }

    public void getInfo() {
        for (int i = 0; i <= trays.size() - 1; i++) {
            Tray tray = trays.get(i);
            System.out.printf("Tray: tray%s, Bread: %s, Garlic: %s, Choc: %s\n", i + 1, tray.getBread().getAmount(), tray.getGarlic().getAmount(), tray.getChocolate().getAmount());
        }
    }


}
