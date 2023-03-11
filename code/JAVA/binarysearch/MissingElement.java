package binarysearch;

public class MissingElement {


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8};
        int missingNumber=solve(arr);
        System.out.println(missingNumber);

    }
    
    private static int solve(int[] arr){

        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==mid+1)
            {
                start=mid+1;
            }
            if(arr[mid]!=mid+1){
                return mid;
            }
        }

        return ans;
    }
}
