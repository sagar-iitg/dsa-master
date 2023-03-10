package basicmath.prime;

public class BasicPrime {

   public static void main(String[] args) {
    


        int n=7;
        boolean flag=false;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                flag=true;
            }
        }

        if(!flag)
        {
            System.out.println("Prime no");
        }
        else{
            System.out.println("Not a prime no");
        }
   }

    
}
