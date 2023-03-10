package sort;

import java.util.Arrays;

public class SortTwoColors {


    public static void main(String[] args) {
        
        //int[] arr={1,1,0,0,1,1,1,0,1,0,1,1,0};
       // int[] arr={1,1,1,1};
        int[] arr={0,0,0,0};

        solve(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void solve(int[] arr) {


        int low=0;
        int high=arr.length-1;

        while(low<high)
        {

            if(arr[low]==0)
            {
                low++;
            }
            else if(arr[high]==1)
            {
                high--;
            }
            else{
                swap(arr,low,high);
            }

        }
    }
      private static void swap(int[] arr,int x,int y)
    {

        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    
    
}
