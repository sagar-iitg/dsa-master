package basicmath.prime;

public class SieveAlgovariation {
    
    public static void main(String[] args) {
        
        primeNo(1,50);
        //false means prime
        //true means not prime;
        //System.out.println(!ans);


    }
    private static void primeNo(int l,int h)
    {
        for(int i=l;i<=h;i++)
        {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }




    private static boolean isPrime(int n)
    {


        if(n<=1)
            return false;

        boolean[] primes=new boolean[n+1];

      

        for(int i=2;i*i<=n;i++)
        {

            if(!primes[i])
            {

                for(int j=i*2;j<=n;j=j+i){
                    primes[j]=true;
                }
            }
        }

        if(!primes[n])
        {
            return true;
        }

        return false;






        


    }

    

    
}
