package assignement.week3;


import java.util.Arrays;

public class NegativeNumberleftSideOfArray {

    public static void main(String[] args) {
        
        //int arr[]={-12, 11, -13, -5, -6,10,20,0,-21, -7, 5, -3, -6};
        int arr[]={ 1, 2,  -4, -5, 2, -7, 3,
                     2, -6, -8, -9, 3, 2,  1 };
        System.out.println(Arrays.toString(arr));
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void solve(int[] arr) {
        int left=0;
        int right=0;

        while(right<arr.length)
        {
           
           if(arr[right]<0){

                swap(arr, left, right);
                left++;
             
            }
               right++;
        }
    }
    
}
