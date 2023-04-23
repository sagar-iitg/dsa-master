package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {


    public static void main(String[] args) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(2);
        stack.push(4);
        stack.push(50);
        System.out.println(stack);
        int x=stack.pop();
        System.out.println(x);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        System.out.println(stack.toString());
        System.out.println(stack.getLast());



        
    }
    
}
