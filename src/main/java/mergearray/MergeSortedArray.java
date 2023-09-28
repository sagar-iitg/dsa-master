package mergearray;

import java.util.Arrays;

public class MergeSortedArray {
    
    public static void main(String[] args) {
        

        int[] arr1={2,4,6,8,10,12,14};
        int[] arr2={1,3,4,5};


        int i=0;
        int j=0;

       
       int x=arr1.length+arr2.length;
        int[] arr=new int[x];

        int k=0;

        while(i<arr1.length && j<arr2.length)
        {

            if(arr1[i]>arr2[j]){
                arr[k]=arr2[j];
                j++;
                k++;

            }

            else{
                arr[k]=arr1[i];
                i++;
                k++;
            }

        }
        System.out.println(i);
        System.out.println(j);
        
        while(i<arr1.length)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
      // System.out.println("2");
       System.out.println( Arrays.toString(arr));


     
    }
    
}
