package array.sum;


public class Pair {


    public static void main(String[] args) {
    
        int arr[]={10,20,40,60,70};


        int target=30;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                        System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }

    }


    
}
