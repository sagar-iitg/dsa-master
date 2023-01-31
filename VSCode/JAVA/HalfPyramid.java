public class HalfPyramid {


    public static void main(String[] args) {
        

        solve(5);
    }

    private static void solve(int n)
    {

        for(int rows=0;rows<n;rows++)
        {
            for(int col=0;col<rows+1;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
    
}
