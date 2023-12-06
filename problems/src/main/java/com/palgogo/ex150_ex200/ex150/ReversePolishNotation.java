package com.palgogo.ex150_ex200.ex150;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReversePolishNotation {


        public int evalRPN(String[] tokens) {
            Deque<Integer> stack = new ArrayDeque<>();
            int a, b;
            for(String str: tokens){
                switch (str) {
                    case "+":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b + a);
                        break;
                    case "-" :
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b - a);
                        break;
                    case "*":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b * a);
                        break;
                    case "/":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b / a);
                        break;
                    default:
                        stack.push(Integer.parseInt(str));
                }
            }
            System.out.print(stack);
            return stack.pop();
        }
    }

