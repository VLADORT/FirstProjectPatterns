package com.vlad.Task1;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Task1 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char a[] = input.toCharArray();

        System.out.println(Arrays.asList(a));




        Value v1 = new Value(1);
        Value v2 = new Value(1);
        Value v3 = new Value(1);
        Value v4 = new Value(1);
        Value v5 = new Value(1);
        Value v6 = new Value(1);

        Expression e1 = new Expression();
        System.out.println(e1.exp("(1+2)"));


        e1.add(v1);
        e1.add(v2);



        scanner.close();
    }

}
