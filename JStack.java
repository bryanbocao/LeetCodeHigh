/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Stack;

/**
 *
 * @author dingwen
 */
public class JStack {

    public static void main(String[] args) {
        String input = args[0];
        Stack<Character> stack = new Stack();
        char[] chs = input.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (stack.empty()) {
                stack.push(chs[i]);
            } else {
                char head = stack.peek();
                if (chs[i] == head) {
                    stack.pop();
                } else {
                    stack.push(chs[i]);
                }
            }

        }
        System.out.println(stack.empty());
    }

    public void alternative() {
        String input = "(((())){}{}";
        while (input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
        System.out.println(input.isEmpty());

    }
}
