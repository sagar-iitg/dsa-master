package assignement.week4;

import java.util.*;


public class LeetCode532 {

    public static void main(String[] args) {
        int[] arr={1,2,4,4,3,3,0,9,2,3};
        //int[] arr={1,3,1,5,4};

        //int[] arr={1,1,1,2,2};
        int k=3;

        int ans=solution(arr,k);
        System.out.println(ans);
    }

    private static int solution(int[] arr, int k) {

        Set<ArrayList<Integer>> set=new HashSet<>();
        //Arrays.sort(arr);
       // int c=0;

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {
                int sub=Math.abs(arr[i]-arr[j]);

                if(sub==k)
                {
                    ArrayList<Integer> temp=new ArrayList<>();

                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    Collections.sort(temp);
                    set.add(temp);


                }

            }
        }
        System.out.println(set);
        return set.size();
    }
}
