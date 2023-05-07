package code.java.stack;

import java.util.Stack;

class FindMiddleElementInStack{


    public static void main(String[] args) {
       
        Stack<Integer> stack=new Stack<>();
       // stack.push(1);
        stack.push(2);
         stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.toString());
        middleElement(stack,stack.size());



    }

    
    private static void middleElement(Stack<Integer> st,int size) {

       
        if(st.isEmpty())
        {
            System.out.println("stack is empty");
            return;
        }
        if(st.size()==(size/2)+1)
        {
            System.out.println(st.peek());
            return;
        }

        int top=st.pop();
        middleElement(st,size);
        //backtrack
        st.push(top);
       
    }


    public static void pushAtBottom(Stack<Integer> s,int data)
    {

        if(s.isEmpty())
        {
            s.push(4);
            return;
        }

        int top=s.pop();
        pushAtBottom(s, data);
        //backtrack
        s.push(top);
       

    }

}
