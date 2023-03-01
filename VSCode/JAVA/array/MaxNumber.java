package array;

public class MaxNumber {



    public static void main(String[] args) {
        
        int arr[]={-2,1,2,3,Integer.MAX_VALUE,Integer.MIN_VALUE};

        int res=maxNoInArray(arr);
        System.out.println(res);

    }

    private static int maxNoInArray(int arr[])
    {


        int max=Integer.MIN_VALUE;




        //for each loop

        for (int curr_no : arr) {
            if(curr_no>max)
            {
                max=curr_no;
            }

            
        }

        return max;
    }
    
}
