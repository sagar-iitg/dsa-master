package bitmanipulation;

public class Even {

    public static void main(String[] args) {
        
        boolean ans=even(2);
        System.out.println(ans);


    }

    private static boolean even(int x)
    {

        if((x&1)!=1)
        {
            return true;
        }
        return false;


       

    }
    
}
