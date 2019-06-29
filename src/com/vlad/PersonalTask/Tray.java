package com.vlad.PersonalTask;

import com.vlad.PersonalTask.Goods.Bread;
import com.vlad.PersonalTask.Goods.Chocolate;
import com.vlad.PersonalTask.Goods.Garlic;

public class Tray {

    private boolean isInStock;

    private Bread bread = new Bread(15,15.30);
    private Chocolate chocolate= new Chocolate(5,30.99);
    private Garlic garlic = new Garlic(5,89.50);

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
    


}
