package basicmath.exponentiation;

public class SlowExponentiation {


    public static void main(String[] args) 
    {

            int res=pow(5,4);
            System.out.println(res);

        



    }
    public static int pow(int a,int b)
    {

        int ans=1;
        for(int i=1;i<=b;i++)
        {
            ans*=a;
        }
        return ans;
    }



}
