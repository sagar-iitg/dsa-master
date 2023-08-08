package assignement.week5;

import java.util.Arrays;

public class ValidAnagramMethod2 {


    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        int[] freqTable=new int[256];
       // System.out.println(Arrays.toString(freqTable));

        for(int i=0;i<s.length();i++)
        {

            //System.out.println(s.charAt(i));
            freqTable[s.charAt(i)]++;

        }
      //  System.out.println(Arrays.toString(freqTable));
        for(int i=0;i<t.length();i++)
        {

            //System.out.println(s.charAt(i));
            freqTable[t.charAt(i)]--;

        }
        for(int i=0;i<freqTable.length;i++)
        {
            if(freqTable[i]!=0)
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");




    }


}
