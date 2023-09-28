package backtracking.string;

public class Permutation {


    public static void main(String[] args) {
        
         String str="abc";
         printPermutation(str,0);
         

    }

    private static void printPermutation(String str,int i)
    {
        // base case
        if(i>=str.length())
        {
            System.out.print(str+" ");
            return;
        }

        //swapping

        for(int j=i;j<str.length();j++)
        {
            str=swap(str,i,j);
            printPermutation(str,i+1);
            //backtracking
            str=swap(str,i,j);

             
        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
   
    
}
