package Bilet_16_copyStack;

import java.util.ArrayDeque;
import java.util.Stack;

public class CopyStack {
    public static Stack<Integer> copyStack(Stack<Integer> stack) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            queue.push(stack.pop());
        }
        while (!queue.isEmpty()){
            stack2.push(queue.getFirst());
            stack.push(queue.pollFirst());
        }
        return stack2;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Stack<Integer> stack2 = copyStack(stack);
        System.out.println(stack2);
        System.out.println(stack);
    }
}
