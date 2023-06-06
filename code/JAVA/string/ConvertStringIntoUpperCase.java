package string;

public class ConvertStringIntoUpperCase {

    public static void main(String[] args) {
        
        char[] ch={'s','a','g','a','r'};
        String ans=solve(ch);
        System.out.println(ans);

    }
    private static String solve(char[] ch)
    {
        String res="";
        for(int i=0;i<ch.length;i++)
        {
               // int temp=(int)ch[i]-32;

                int temp1=ch[i]-'a'+'A';

                res=res+(char)temp1;

        }
        return res;

    }
    
}
