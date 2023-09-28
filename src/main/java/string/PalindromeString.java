package string;

public class PalindromeString {

    public static void main(String[] args) {
        
        String str="noon";
        boolean ans=checkPalindrome(str);
        System.out.println(ans);

    }
    private static boolean checkPalindrome(String str)
    {
        char ch[]=str.toCharArray();
        int firstIndex=0;
        int lastIndex=ch.length-1;
        while(firstIndex<=lastIndex)
        {
            if(ch[firstIndex]!=ch[lastIndex])
            {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
    
}
