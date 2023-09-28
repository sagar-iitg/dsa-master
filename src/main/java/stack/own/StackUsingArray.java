package stack.own;



public class StackUsingArray {



    //size of the array
    private int size=100;
    private int top;
    StackUsingArray(){

        this.top=-1;
    }

    StackUsingArray(int size)
    {
       this.top=-1;
        this.size=size;
    }
    private int stack[]=new int[size];
  
   
    // isEmpty()

    public boolean isEmpty(){

        return top==-1;
    }

     //push
     public void push(int data)
     {
        if(top==this.size-1)
        {
            System.out.println("stack is full!! you need to pop some elements then you can push it again!!");
            //top=-1;
            return;
        }
       // System.out.println(this.top);

        this.top++;
        stack[this.top]=data;
         
 
     }
 
     public int size(){
 
         return top+1;
     }
 
 
     //pop
 
     public int pop(){
         if(isEmpty())
         {
             return -1;
         }
         int res=stack[top];
         top--;
         return res;
 
     }
 
     //peek
 
     public int peek(){
         if(isEmpty())
         {
             return -1;
         }
         return stack[top];
     }

    

    
    
}
