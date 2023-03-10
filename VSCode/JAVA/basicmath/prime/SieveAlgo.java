package basicmath.prime;

public class SieveAlgo {
    
    public static void main(String[] args) {
        
        boolean ans=isPrime(-5);
        //false means prime
        //true means not prime;
        System.out.println(!ans);


    }

    private static boolean isPrime(int n)
    {


        if(n<=1 && n>=0)
        {
            return true;
        }
        if(n<0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        boolean[] primes=new boolean[n+1];
        //false means prime
        //true means not prime;

        for(int i=2;i*i<=n;i++)
        {

            if(!primes[i])
            {

                for(int j=i*2;j<=n;j=j+i){
                    primes[j]=true;
                }
            }
        }
        return primes[n];


        


    }

    

    
}
