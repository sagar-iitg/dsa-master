package code.java.stack;

import java.util.Stack;

public class ReversStringUsingStack {


    public static void main(String[] args) {
        
        //System.out.println("hello world");
        String str="sagar";
        System.out.println(solve(str));
    }

    private static String solve(String str)
    {
        Stack<Character> stack=new Stack<>();
        int idx=0;

        while(idx<str.length())
        {
            stack.push(str.charAt(idx));
            idx++;
        }


       StringBuilder res=new StringBuilder();
       while(!stack.isEmpty())
       {
            char ch=stack.pop();
            res=res.append(ch);

       }
       System.out.println(res);
        return res.toString();




        
    }
    
}
