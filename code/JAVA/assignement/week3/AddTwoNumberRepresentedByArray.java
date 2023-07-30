package assignement.week3;

public class AddTwoNumberRepresentedByArray {


    public static void main(String[] args) {
        int a[] = {0, 5,2,3};
        int b[] = { 4,1,4 };
        String ans=solve(a,b);
        System.out.println(ans);

    }
    private static String solve(int[] a,int[] b)
    {

        int carry=0;
        int i=a.length-1;
        int j=b.length-1;
        StringBuilder s=new StringBuilder();
        while(i>=0 && j>=0)
        {
            int sum=a[i]+b[j]+carry;
            int digit=sum%10;
            s.append(digit);
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0)
        {
            int sum=a[i]+carry;
            int digit=sum%10;
            s.append(digit);
            carry=sum/10;
            i--;

        }
        while(j>=0)
        {
            int sum=b[j]+carry;
            int digit=sum%10;
            s.append(digit);
            carry=sum/10;
            j--;

        }
       if(carry!=0)
            s.append(carry);

       // System.out.println(s);
//        for (int k=0;k<s.length();k++) {
//            System.out.println(s.charAt(k));
//
//        }

        while(s.charAt(s.length()-1)=='0')
        {
            s.deleteCharAt(s.length()-1);
          //  System.out.println(s);
        }
       // System.out.println(s);


        s.reverse();
        //System.out.println(s);
        return s.toString();


    }


}
