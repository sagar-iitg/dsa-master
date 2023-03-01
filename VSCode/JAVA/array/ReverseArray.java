package array;

import java.util.Arrays;

public class ReverseArray {



    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50,60};

        reverse(arr);
        Arrays.stream(arr).forEach(s->System.out.print(s+" "));
    }

    private static void reverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    
    private static void swap(int[] arr,int first, int second)
    {

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
