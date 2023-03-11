package binarysearch.inbuilt;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class BinarySearch
{


    public static void main(String[] args) {
       int arr[]={1,2,5,6,7,8,9};
       System.out.println(Arrays.binarySearch(arr, 2,5,5));
       List<Integer> arr1=List.of(1,2,3,4,5);
       System.out.println(Collections.binarySearch(arr1, 3));

    }
}

