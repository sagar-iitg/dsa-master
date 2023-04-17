package divide.conquer;

import java.util.Arrays;

public class QuickSort {



    public static void main(String[] args) {
        
        int[] arr={1,1,1,1,1,2,2,2,2,2,1,9,5,-6,8,8,-3,4,55};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int s,int e)
    {



        //base case
        if(s>=e)
        {
            return;

        }

        //partition logic

        int p=partition(arr,s,e);

        //recursive calls --left side
        quickSort(arr,s,p-1);


        //right side

        quickSort(arr, p+1, e);



    }

    private static int partition(int arr[],int s,int e)
    {



        //step1 
        int pivotIndex=s;
        int pivotElement=arr[s];

        //step 2

        int count=0;
        for(int i=s+1;i<=e;i++)
        {
            if(arr[i]<=pivotElement)
            {
                count++;
            }
        }

        int rightIndex=s+count;
        swap(arr,pivotIndex,rightIndex);
        pivotIndex=rightIndex;

        //step 3: left -small elements right- bigger elements

        int i=s;
        int j=e;

        while(i<pivotIndex && j> pivotIndex)
        {

         
            while(arr[i]<=pivotElement)
            {
                i++;
            }
            while(arr[j]>pivotElement)
            {
                j--;
            } 


            //2 case ho sakte hai
            //A -> you found the elements to swap
            //B-> no need to swap

            if(i<pivotIndex && j> pivotIndex)
            {
                swap(arr,i,j);
            }




        }

        return pivotIndex;



    }

    private static void swap(int[] arr,int i,int j)
    {

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
 
    
}
