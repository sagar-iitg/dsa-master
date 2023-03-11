package basicmath.exponentiation;

public class FastExponentiation
{

    

    public static void main(String[] args)
    {


        int res=pow(2,4);
        System.out.println(res);
    }

    private static int pow(int a,int b)
    {

        int ans=1;
        while( b>0 )
        {

            //checking b is odd or not
            
            if((b&1)==1)
            {
                ans=ans*a;

            }
            a=a*a;
            b=b>>1;

            


        }
        return ans;
        

    }
}
