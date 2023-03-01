package array;

public class Count0And1 {

    public static void main(String[] args) {
        

        int arr[]={0,1,0,1,1,1,0,0,0,1,0,1,1};

        count(arr);
    }

    protected static void count(int[] arr)
    {


        int c=0;
        for (int i : arr) {
         
            
            if(i==0)
            {
                c++;
            }
        }
        int onesCount=arr.length-c;

        System.out.println(arr.length);
        System.out.println("0s Count "+c+" "+" 1s count"+" "+ onesCount);
    }
}
