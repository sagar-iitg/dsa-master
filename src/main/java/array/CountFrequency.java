package array;

import java.util.Arrays;

public class CountFrequency {


    public static void main(String[] args) {
        String str="ababbz";
        int[] freq=new int[26];
        System.out.println(Arrays.toString(freq));
        //System.out.println((int)'a');
        for(char ch:str.toCharArray())
        {
            //System.out.println(ch);
            freq[ch-'a']++;
        }
        System.out.println();
        System.out.println(Arrays.toString(freq));

    }
    
}
