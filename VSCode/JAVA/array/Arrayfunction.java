package array;

public class Arrayfunction {



    public static void main(String[] args) {
        
        int[] arr={1,-2,3,56,70,-98,100};

        fun(arr);
        System.out.println(arr[1]);
    }

    protected static void fun(int[] arr1)
    {
        arr1[1]=24;
        System.out.println(arr1.length);
    } 
    
}
