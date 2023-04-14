package sorting;


class MergeSort{


    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        
    }

    private static void mergeSort(int[] arr, int s, int e) {
        //baseCase
        if(s>=e)
        {
            return;
        }

        int mid=(s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        merge(arr,s,e);
        



    }

    private static void merge(int[] arr, int s, int e)
    {


       

    }



}