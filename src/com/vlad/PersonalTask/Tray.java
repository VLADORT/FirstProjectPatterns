package com.vlad.PersonalTask;

import com.vlad.PersonalTask.Goods.Bread;
import com.vlad.PersonalTask.Goods.Chocolate;
import com.vlad.PersonalTask.Goods.Garlic;

public class Tray implements  Observer {

     boolean isNotInStock;

    private Bread bread = new Bread(5,15.30);
    private Chocolate chocolate= new Chocolate(5,30.99);
    private Garlic garlic = new Garlic(5,8.50);

    public Bread getBread() {
        return bread;
    }

    public Chocolate getChocolate() {
       return  chocolate;
    }

    public Garlic getGarlic() {
        return garlic;
    }

    public Good getGood(String name) {
        Good good = null;
        if (name == bread.getName()) {
            good = bread;
        }
        if (name == garlic.getName()) {
            good = garlic;
        }
        if (name == chocolate.getName()) {
            good =  chocolate;
        }


        return good;
    }


    @Override
    public void Notify() {
        this.isNotInStock = bread.empty||garlic.empty||chocolate.empty;
        if (bread.empty)
            System.out.println("Bread is absent");
        if (garlic.empty)
            System.out.println("Garlic is absent");
        if (chocolate.empty)
            System.out.println("Chocolate is absent");


    }
}
