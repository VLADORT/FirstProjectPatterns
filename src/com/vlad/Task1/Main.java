package com.vlad.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        Expression expression = new Expression();
        String input = scanner.nextLine();
        input = expression.rpn(input);
        System.out.println(expression.compute(input));

    }
    }

