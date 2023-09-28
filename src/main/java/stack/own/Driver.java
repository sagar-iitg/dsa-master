package stack.own;

public class Driver {

    public static void main(String[] args) {
        
        //StackUsingArrayList st=new StackUsingArrayList();
        StackUsingArray st=new StackUsingArray(2);
       


        System.out.println(st.isEmpty());
        st.push(2);
        st.push(1);
        System.out.println(st.size());
         st.push(3);
         System.out.println(st.size());
         System.out.println(st.peek());
         st.push(10);
         System.out.println(st.size());
         System.out.println(st.peek());
        // st.push(4);
        // System.out.println(st.isEmpty());

        // System.out.println(st.size());
        // System.out.println(st.peek());
        // System.out.println(st.pop());

    }
    
}
