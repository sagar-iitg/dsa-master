package stack.own;

public class Driver {

    public static void main(String[] args) {
        
        StackUsingArrayList st=new StackUsingArrayList();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.size());

    }
    
}
