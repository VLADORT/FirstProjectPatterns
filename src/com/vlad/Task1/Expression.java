package com.vlad.Task1;

import java.util.Stack;
import java.util.StringTokenizer;

public class Expression {

    public boolean isOperator(char c) {
        switch (c) {
            case '-':
            case '+':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    public byte priority(char p) {
        switch (p) {
            case '*':
            case '/':
                return 2;
        }
        return 1;
    }

    public String rpn(String input) {
        StringBuilder stack = new StringBuilder(), out = new StringBuilder();
        char charIn, charTemp;

        for (int i = 0; i < input.length(); i++) {
            charIn = input.charAt(i);
            if (isOperator(charIn)) {
                while (stack.length() > 0) {
                    charTemp = stack.substring(stack.length() - 1).charAt(0);
                    if (isOperator(charTemp) && (priority(charIn) <= priority(charTemp))) {
                        out.append(" ").append(charTemp).append(" ");
                        stack.setLength(stack.length() - 1);
                    } else {
                        out.append(" ");
                        break;
                    }
                }
                out.append(" ");
                stack.append(charIn);
            } else if (charIn == '(') {
                stack.append(charIn);
            } else if (charIn == ')') {
                charTemp = stack.substring(stack.length() - 1).charAt(0);
                while (charTemp != '(') {
                    if (stack.length() < 1) {
                        System.out.println("INVALID INPUT");
                        System.exit(1);
                    }
                    System.out.println(out);
                    out.append(" ").append(charTemp);
                    System.out.println(out);
                    stack.setLength(stack.length() - 1);
                    charTemp = stack.substring(stack.length() - 1).charAt(0);
                }
                stack.setLength(stack.length() - 1);
            } else {
                out.append(charIn);
            }
        }
        while (stack.length() > 0) {
            out.append(" ").append(stack.substring(stack.length() - 1));
            stack.setLength(stack.length() - 1);
        }
        return out.toString();
    }

    public double compute(String s) {
        Calculator a;
        Calculator b;
        String temp;
        Stack<Calculator> stackCalc = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreTokens()) {
            try {
                temp = tokenizer.nextToken().trim();
                if (temp.length() == 1 && isOperator(temp.charAt(0))) {
                    if (stackCalc.size() < 2) {
                        System.out.println("Invalid amount of data in stack for operation: " + temp);
                        System.exit(1);
                    }
                    b = new Value(stackCalc.pop().compute());
                    a = new Value(stackCalc.pop().compute());
                    switch (temp.charAt(0)) {
                        case '+':
                            a = new Addition(a, b);
                            break;
                        case '-':
                            a = new Subtraction(a, b);
                            break;
                        case '/':
                            a = new Division(a, b);
                            break;
                        case '*':
                            a = new Multiplication(a, b);
                            break;
                        default:
                            System.out.println("Wrong operation: " + temp);
                            System.exit(1);
                    }
                    stackCalc.push(a);
                } else {
                    a = new Value(Double.parseDouble(temp));
                    stackCalc.push(a);
                }
            } catch (Exception e) {
                System.out.println("Wrong symbol in expression");
                System.exit(1);
            }
        }

        if (stackCalc.size() > 1) {
            System.out.println("Amount of operators doesn't match to amount of operands");
            System.exit(1);
        }

        return stackCalc.pop().compute();
    }
}
