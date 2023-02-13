package array.union;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingMethod {

    public static void main(String[] args) {
        
        // int[] arr1={10,5,4,3,2,2};
        // int[] arr2={1,9,10,2,-1,25,56,67,90};

        int[] arr1={2,6,8};
        int[] arr2={1,3,5,6,7,9,10};

        ArrayList<Integer> res=new ArrayList<>();
        res=union( arr1, arr2);
        System.out.println(res);
    }

    public static  ArrayList<Integer> union(int[] arr1,int[] arr2)
    {



        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i=0;
        int j=0;

        while(i<arr1.length && j<arr2.length)
        {

                if(arr1[i] >arr2[j])
                {
                    ans.add(arr2[j]);
                    j++;

                }
                else if(arr1[i] < arr2[j])
                {
                    ans.add(arr1[i]);
                    i++;
                    
                }
                else{
                    ans.add(arr1[i]);
                    i++;
                    j++;

                }
        }

        if(i<=(arr1.length-1))
        {
            for(int k=i;k<arr1.length;k++)
                ans.add(arr1[k]);
        }

        if(j<=(arr2.length-1))
        {
            for(int k=j;k<arr2.length;k++)
                ans.add(arr2[k]);
        }

        return ans;


    }

    
}
