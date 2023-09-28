package tree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Pair<K,V>{

    K first;
    V second;
    Pair(){

    }
    Pair(K first,V second)
    {
        this.first=first;
        this.second=second;
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;

    }
}

public class Tree {

    static int idx=-1;
    public static Node buildTree(int nodes[]){
          
        idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }
        Node newNode=new Node(nodes[idx]);

        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;

    }
 
    public static Node buildTree1(int nodes[],int idx){
         
       
    
        if(nodes[idx]==-1)
        {
            //idx++;
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        
        newNode.left=buildTree1(nodes,idx+1);
        newNode.right=buildTree1(nodes,idx+1);

        return newNode;

    }


    static void levelOrder(Node root)
    {
       
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
       // q.add(null);

        while(!q.isEmpty())
        {

           
            Node temp=q.peek();
           
            q.remove();
            System.out.print(temp.data+" ");
            
        
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
          

         
        

            

        }
       
          
        

    }

   static void printTopView(Node root) 
    {


        
        if(root==null)
        {
            return;
        }

        Map<Integer,Integer> topNode=new HashMap<>();
        Queue<Pair<Node,Integer>> queue=new LinkedList<>();
        Pair<Node,Integer> p=new Pair<>(root,0);


        queue.add(p);


        while(!queue.isEmpty())
        {
            Pair<Node,Integer> temp=queue.peek();
            queue.remove();
            Node frontNode=temp.first;
            int hd=temp.second;

            //jo bhi horizaontal distance aaya check if answer for that ans exist or not

            if(!topNode.containsKey(hd))
            {
                    topNode.put(hd,frontNode.data);

            }

            if(frontNode.left!=null)
            {
                queue.add(new Pair<Node,Integer>(frontNode.left, hd-1));


            }
            if(frontNode.right!=null)
            {
                queue.add(new Pair<Node,Integer>(frontNode.right, hd+1));
                

            }


        }

          for(Map.Entry<Integer,Integer> i:topNode.entrySet())
          {
            System.out.print(i.getValue()+" ");
          }
          System.out.println(topNode);
          System.out.println();






    }
    static void preOrder(Node root)
    {
            if(root==null)
                return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

    }
    static void postOrder(Node root)
    {
            if(root==null)
                return;
           
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");

    }
    static void inOrder(Node root)
    {
            if(root==null)
                return;

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
            

    }
   
    static void printBottomView(Node root) 
    {


        
        if(root==null)
        {
            return;
        }

        Map<Integer,Integer> topNode=new HashMap<>();
        Queue<Pair<Node,Integer>> queue=new LinkedList<>();
        Pair<Node,Integer> p=new Pair<>(root,0);


        queue.add(p);


        while(!queue.isEmpty())
        {
            Pair<Node,Integer> temp=queue.peek();
            queue.remove();
            Node frontNode=temp.first;
            int hd=temp.second;

           
                    topNode.put(hd,frontNode.data);

          

            if(frontNode.left!=null)
            {
                queue.add(new Pair<Node,Integer>(frontNode.left, hd-1));


            }
            if(frontNode.right!=null)
            {
                queue.add(new Pair<Node,Integer>(frontNode.right, hd+1));
                

            }


        }

          for(Map.Entry<Integer,Integer> i:topNode.entrySet())
          {
            System.out.print(i.getValue()+" ");
          }
          System.out.println(topNode);
          System.out.println();






    }
    
    
    static void printLeftView(Node root,ArrayList<Integer> ans,int level){
        

        //base case

        if(root==null)
            return;

        if(level==ans.size())
        {
            ans.add(root.data);
        }
        printLeftView(root.left, ans, level+1);
        printLeftView(root.right, ans, level+1);
    }


    static void printRightView(Node root,ArrayList<Integer> ans,int level){
        

        //base case

        if(root==null)
            return;

        if(level==ans.size())
        {
            ans.add(root.data);
        }
        printRightView(root.right, ans, level+1);
        printRightView(root.left, ans, level+1);
    }

    static void boundary(Node root)
    {
        if(root==null)
            return;
        

        System.out.println(root.data);

        //A
        printLeftNodes(root.left);
        //B
        printLeafNodes(root);
        printRightNodes(root.right);


    }
    
    static void printLeafNodes(Node root)
    {

        if(root==null)
            return;
        if(root.left==null && root.right==null)
            {
                System.out.println(root.data);
            }
              printLeafNodes(root.left);

          
                printLeafNodes(root.right);
         
            


        
        
    }

    static void printRightNodes(Node root) {

        if(root==null){
            return;
        }

        if(root.left==null && root.right==null)
            return;
        
        
        if(root.right!=null)
        {
            printRightNodes(root.right);

        }
       
        else{
            printRightNodes(root.left);
        }
       

        System.out.println(root.data);
        


        
        
}
    static void printLeftNodes(Node root) {

            if(root==null){
                return;
            }

            if(root.left==null && root.right==null)
                return;

            
            System.out.println(root.data);
                if(root.left!=null)
                {
                printLeftNodes(root.left);
                }
            else{
                printLeftNodes(root.right);
            }


            
            
    }

    public static void main(String[] args) {
       
         //preorder sequence

         //array 
         //int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         //int nodes[]={10,20,30,-1,-1,40,60,-1,-1,-1,80,50,-1,70,-1,-1,90,-1,-1};
        

         //int nodes[]={10,20,30,-1,-1,40,60,-1,-1,-1,80,50,-1,70,-1,-1,90,-1,-1};
        int nodes[]={10,20,30,-1,-1,50,70,90,-1,-1,80,-1,-1,60,-1,-1,40,-1,100,-1,120,110,-1,-1,130,-1,-1};


         //building tree using buildTree
         Node root=buildTree(nodes);
         boundary(root);

         
            // ArrayList<Integer> ans=new ArrayList<>();
            // printLeftView(root,ans,0);
            // System.out.println(ans);


            // ArrayList<Integer> ans=new ArrayList<>();
            // printRightView(root,ans,0);
            // System.out.println(ans);


           // printBottomView(root);
         
         //levelOrder(root);




         //building tree using buildTree1
         //Node head=buildTree1(nodes,0);
        /*------------------------------ */ 
      
        //incorrect output using buildTree1
     //   preOrder(head);

        // System.out.println();
        
        // //correct output using buildTree
        // preOrder(root);
        // System.out.println("----");
        // printTopView(root);

        
       

        //inOrder(root);
        //postOrder(root);


    }
    
}
