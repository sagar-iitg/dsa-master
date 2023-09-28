package stack.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {


    public static void main(String[] args) {
        
        Deque<Integer> stack = new ArrayDeque<>();


        //push
        //pop
        //peek -->top element
        //isEmpty()
        //size()
        //
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

        
        // 
        
        Deque<Integer> st=new ArrayDeque<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("st -- "+st);



        
    }
    
}
