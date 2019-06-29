package com.vlad.PersonalTask.Goods;

import com.vlad.PersonalTask.Automate;
import com.vlad.PersonalTask.Good;

public class Garlic implements Good {

    private int amount;
    private double price;
    private String name = "garlic";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Garlic(int amount, double price) {
        this.amount = amount;
        this.price = price;
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

    @Override
    public void update(int amount) {
        this.amount -= amount;

    }
}
