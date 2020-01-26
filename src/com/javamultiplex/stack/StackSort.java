package com.javamultiplex.stack;

import java.util.Stack;

public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(34);
        stack.add(3);
        stack.add(31);
        stack.add(98);
        stack.add(92);
        stack.add(23);
        Stack<Integer> sortedStack = sort(stack);
        while (!sortedStack.isEmpty()){
            System.out.print(sortedStack.pop()+" ");
        }

    }

    private static Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> temp=new Stack<>();
        while (!stack.isEmpty()){
            Integer element = stack.pop();
            while (!temp.isEmpty() && temp.peek()>element){
                stack.push(temp.pop());
            }
            temp.push(element);
        }
        return temp;
    }

}
