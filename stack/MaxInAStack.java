package stack;

import java.util.Stack;

public class MaxInAStack {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        int max = -999999;

        stack.push(2);
        max = 2;
        maxStack.push(max);

        stack.push(1);
        max = 2;
        maxStack.push(max);
        stack.push(3);
        max = 3;
        maxStack.push(max);
        stack.push(3);
        max = 3;
        maxStack.push(max);
        stack.push(4);
        max = 4;
        maxStack.push(max);

        System.out.println(maxStack.peek());

        stack.pop();
        maxStack.pop();

        System.out.println(maxStack.peek());

        stack.pop();
        maxStack.pop();

        System.out.println(maxStack.peek());

        stack.pop();
        maxStack.pop();

        System.out.println(maxStack.peek());

    }
    
}
