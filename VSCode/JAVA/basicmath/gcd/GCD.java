package basicmath.gcd;


public class GCD {


    public static void main(String[] args) {
        
       int ans=gcd(56,98);
       System.out.println(ans);

    }

    static int gcd(int a, int b)
    {
      if (b== 0)
        return a;

      return gcd(b, a%b);
    }
     
    
}
