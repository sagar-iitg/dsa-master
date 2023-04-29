package stack.own;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {

    private List<Integer> stack=new ArrayList<>();


    // isEmpty()

    public boolean isEmpty(){

        return stack.size()==0;
    }

    //push
    public void push(int data)
    {
        stack.add(data);

    }

    public int size(){

        return stack.size();
    }


    //pop

    public int pop(){
        if(stack.isEmpty())
        {
            return -1;
        }
        int top=stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;

    }

    //peek

    public int peek(){
        if(stack.isEmpty())
        {
            return -1;
        }
        return stack.get(stack.size()-1);
    }

    @Override
    public String toString() {
        return  ""+stack.toString() ;
    }

    

    
    
}
