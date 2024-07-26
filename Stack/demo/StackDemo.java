package demo;

import stack.Stack;
import stack.StackImpl;

public class StackDemo {
    public static void main(String[] args) {

        System.out.println("Stack Array Implementation");
        Stack stack = new StackImpl();
        System.out.println("Stack is empty " + stack.isEmpty());
        stack.push("B");
        stack.push(2);
        stack.push("B");
        stack.push(0);
        stack.push(7);
        System.out.println("Stack is empty " + stack.isEmpty());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


        System.out.println("Stack Implementation");
        Stack stack1 = new StackImpl();
        System.out.println("Stack is empty " + stack1.isEmpty());
        stack1.push("B");
        stack1.push(2);
        stack1.push("B");
        stack1.push(0);
        stack1.push(7);
        System.out.println("Stack is empty " + stack1.isEmpty());

        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }


    }
}