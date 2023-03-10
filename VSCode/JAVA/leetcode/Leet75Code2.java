package leetcode;

import java.util.Arrays;

public class Leet75Code2 {


    public static void main(String[] args) {
        
        int arr[]={0,1,2,2,2,0,0,0,1,1,1,0,0,1,1,2};
        solve(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void solve(int[] a)
    {

        int low=0;
        int mid=0;
        int high=a.length-1;

        while(mid<=high)
        {

            if(a[mid]==2)
            {
                swap(a,mid,high);
                high--;

            }
            else if(a[mid]==0)
            {
              
                swap(a,mid,low);
                low++;
                mid++;


            }
            else{
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
