package array;

public class TwoPointer {


    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7};

        solve(arr);
    }
    static void solve(int[] arr)
    {

        int start=0;
        int end=arr.length-1;
        while(true)
        {
            if(start>end)
            {
                return;
            }

            if(start==end)
            {
                System.out.println(arr[start]);
                return;
            }
            System.out.println(arr[start]);
            System.out.println(arr[end]);
            start++;
            end--;
        }
    }
    
}
