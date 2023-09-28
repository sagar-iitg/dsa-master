package tree.bst;


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
public class BST {




    static Node insert(Node root,int val)
    {

            if(root==null)
            {
                root=new Node(val);
                return root;
            }

            if(root.data>val){
                root.left=insert(root.left, val);
            }
            else{
                root.right=insert(root.right, val);
            }

            return root;



    }

    public static void inOrder(Node root)
    {
        if(root==null)
            return;
        
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }


    
    public static void main(String[] args) {
        
        int values[]={5,1,3,4,2,7,20};
        Node root=null;

        for (int i : values) {
            
            root=insert(root, i);
        }
        inOrder(root);



        


    }

    
}
