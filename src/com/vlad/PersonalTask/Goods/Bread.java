package com.vlad.PersonalTask.Goods;

import com.vlad.PersonalTask.Automate;
import com.vlad.PersonalTask.Good;

public class Bread implements Good {

    public boolean empty;
    private int amount;
    private double price;
    private String name = "bread";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bread(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    @Override
    public void update(int amount) {
        if (this.amount - amount < 0) {
            System.out.println("There are less elements in stock, choose appropriate value");
            System.exit(1);
        } else {
            this.amount -= amount;
            if (this.amount == 0) {
                empty = true;
            }
        }

    }
}
