

package leetcode;

import java.util.Arrays;

public class Leet75Code1 {
    

    public static void main(String[] args) {
        
        int[] nums={1,0,2,0,0,2,1,1,0,2,1,0};

        sortColors(nums);
        Arrays.stream(nums).forEach(i->System.out.print(i+" "));
    }

    public static void sortColors(int[] nums) {
     
        int lengthOfArray=nums.length;
        int countZerosPresentInArray=0;
        int countOnePresentInArray=0;
        int countTwoPresentInArray=0;

        for(int index=0;index<lengthOfArray;index++)
        {
            if(nums[index]==0)
            {
                countZerosPresentInArray++;
            }
            else if (nums[index]==1){
                countOnePresentInArray++;
            }
        }
        countTwoPresentInArray=lengthOfArray-( countZerosPresentInArray+countOnePresentInArray);
      
        System.out.println(countZerosPresentInArray);
        System.out.println(countOnePresentInArray);
        System.out.println(countTwoPresentInArray);
        for(int index=0;index<countZerosPresentInArray;index++)
        {
            nums[index]=0;
        }
        for(int index=countZerosPresentInArray;index<(countOnePresentInArray+countZerosPresentInArray);index++)
        {
            nums[index]=1;
        }
        for(int index=(countZerosPresentInArray+countOnePresentInArray);index<(countZerosPresentInArray+countOnePresentInArray+countTwoPresentInArray);index++)
        {
            nums[index]=2;
        }


     
    }


}
