package string;

public class ReverseString1 {

    public static void main(String[] args) {
        String str="sagar kumar";
        String ans=solve(str.toCharArray());
        System.out.println(ans);
    }

    public static String solve(char[] ch)
    {

        int firstIndex=0;
        int lastIndex=ch.length-1;
        while(firstIndex<=lastIndex)
        {
            swap(ch,firstIndex,lastIndex);
            firstIndex++;
            lastIndex--;
        }
        
        return new String(ch);

    }

    private static void swap(char[] ch, int firstIndex, int lastIndex) {

        char temp=ch[firstIndex];
        ch[firstIndex]=ch[lastIndex];
        ch[lastIndex]=temp;
    }

    
}
