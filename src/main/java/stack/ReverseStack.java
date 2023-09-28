package stack;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.toString());
        reverse(st);
        System.out.println(st.toString());

    }

    private static void reverse(Stack<Integer> st) {

      
        if(st.isEmpty())
        {
            
           
            return;
        }

        int top=st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    
    public static void pushAtBottom(Stack<Integer> s,int data)
    {

        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s, data);
        //backtrack
        s.push(top);
       

    }
  
    
}
