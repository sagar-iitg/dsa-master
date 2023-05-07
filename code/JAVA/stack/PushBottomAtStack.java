package stack;
import java.util.*;

public class PushBottomAtStack {


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
    public static void main(String[] args) {
     
        

        Stack<Integer> stack=new Stack<>();
         stack.push(1);
         stack.push(2);
         stack.push(3);

         pushAtBottom(stack,4);


         while(!stack.isEmpty())
         {
            System.out.println(stack.pop());
         }
    }
    
}
