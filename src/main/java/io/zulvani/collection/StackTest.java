package io.zulvani.collection;

import java.util.Stack;

public class StackTest {

    public StackTest() {

        Stack<String> stack = new Stack<>();
        stack.push("3");
        stack.push("2");
        stack.push("1");

        do {
            System.out.println(stack.pop() + " / " + stack.size());
        } while (!stack.isEmpty());

    }

    public static void main(String[] args){
        new StackTest();
    }
}
