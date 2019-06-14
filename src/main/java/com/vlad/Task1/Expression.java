package com.vlad.Task1;

import java.util.ArrayList;
import java.util.List;

class Expression  {

    int result;


    private List<Computable> computables = new ArrayList<>();


    public  int exp(String expression) {


        if (expression.matches("(\\d+)(?:\\s*)([\\+\\-\\*\\/])(?:\\s*)(\\d+)")) {
            char operator = expression.toCharArray()[2];
            char expArray[]=expression.toCharArray();


            switch (operator) {
                case '+':
                    result = expArray[1] + expArray[3];
                    break;
                case '-':
                    result = expArray[1] - expArray[3];
                    break;
                case '*':
                    result = expArray[1] * expArray[3];
                    break;
                case '/':
                    result = expArray[1] / expArray[3];
                    break;
            }

        }
            return result;
    }




    public void add(Computable computable) {
        computables.add(computable);
    }

    public void remove(Computable computable) {
        computables.remove(computable);
    }


}
