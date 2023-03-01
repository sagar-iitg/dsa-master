package leetcode;

import java.util.Arrays;

public class Leet75Code {
    

    public static void main(String[] args) {
        
        int[] nums={1,0,2,0,0,2,1,1,0,2,1,0};

        sortColors(nums);
        Arrays.stream(nums).forEach(i->System.out.print(i+" "));
    }

    public static void sortColors(int[] nums) {
        

        Arrays.sort(nums);
    }


}
