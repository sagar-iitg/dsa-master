package binarysearch;

public class FirstOccurence {


    public static void main(String[] args) {
        

        int arr[]={1,3,3,4,4,4,4,4,6,7,9};
        int res=binarySearch(arr,4);
        System.out.println(res);
    }
    private static int binarySearch(int[] arr,int target)
    {

        int ans=-1;
        int start=0;
        int end=arr.length-1;


        while(start<=end)
        {


            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid] > target)
            {
                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }

        return ans;

    }
    
}
