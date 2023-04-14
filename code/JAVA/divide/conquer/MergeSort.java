package divide.conquer;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr={1,9,5,-6,8,8,-3,4,55};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int s,int e)
    {

            if(s>=e)
            {
                return;
            }
            int mid=(s+e)/2;

            //left part sort kar do recursion babu
            mergeSort(arr, s, mid);
            //right part sort kar do recursion babu
            mergeSort(arr, mid+1, e);


            //now merge two sorted arrray

            merge(arr,s,e);

    }
    
    private static void merge(int[] arr,int s,int e)
    {
        int mid=(s+e)/2;
        int len1=mid-s+1;
        int len2=e-mid;


        //assume to create arrays for len1, len2 lenght
        int left[]=new int[len1];
        int right[]=new int[len2];

        int k=s;
        for(int i=0;i<len1;i++)
        {
            left[i]=arr[k];
            k++;

        }

        k=mid+1;
        for(int i=0;i<len2;i++)
        {
            right[i]=arr[k];
            k++;

        }



        //merge logic

        int leftIndex=0;
        int rightIndex=0;
        int mainArrayIndex=s;


        while(leftIndex<len1 && rightIndex<len2)
        {

            if(left[leftIndex] <right[rightIndex])
            {
              
                arr[mainArrayIndex++]=left[leftIndex++];
                
            }

            else
            {

                arr[mainArrayIndex++]=right[rightIndex++];
        
 
            }

        }


        //copy logic

        while(leftIndex<len1)
        {
            arr[mainArrayIndex++]=left[leftIndex++];
        }


        while(rightIndex<len2)
        {
            arr[mainArrayIndex++]=right[rightIndex++];
        }


    }

}
