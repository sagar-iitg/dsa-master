package array;

import java.util.Arrays;


public class NegativeNumberLeftSideOfArray {


    public static void main(String[] args) {
        
        int[] arr={1,-2,3,4,5,-4,-2,4,-9,-4,9,-7};

        solve(arr);
        Arrays.stream(arr).forEach(x->System.out.print(x+" "));

    }

    private static void solve(int[] arr) {


        int high=arr.length-1;
        int low=0;
        int mid=0;


        while(mid<=high)
        {

            if(arr[mid]>=0)
            {
                swap(arr,mid,high);
                mid++;
                high--;
            }
            else if(arr[mid]<0 && mid!=low)
            {
                swap(arr,mid,low);
                low++;
            }
        
            else if(arr[mid]<0 && mid==low)
            {
                swap(arr,mid,low);
                low++;
                mid++;
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
