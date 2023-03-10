package basicmath.prime;

public class Prime{


    public static void main(String[] args) {
        


        int count=0;
        int x=499979;

        for(int i=0;i<x;i++)
        {

            int res=printPrimeNumber(i);
            //System.out.println(res);
            if(res!=-1)
            {
                System.out.print(res+" ");
                count++;
            }
               

        }
        System.out.println("Count---------" + count);
           
            
       

      }

    private static int printPrimeNumber(int n) {



        boolean flag=false;;
        int ans=-1;

        
        if(n<=1)
        {   
            return -1;
        }
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            { 
                flag=true;
            }
        }
        if(!flag)
            ans=n;

        return ans;
       
        


    }
    
}
