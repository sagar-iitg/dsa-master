package assignement.week3;

public class FactorialOfNumber {


    public static void main(String[] args) {


        int n=12;
        for(int i=0;i<=n;i++)
        {
            System.out.println("factorial of "+ i +"----"+fact(i));

        }


    }
    public static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);

    }
}
