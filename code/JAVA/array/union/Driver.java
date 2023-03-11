package array.union;

import java.util.ArrayList;

public class Driver {


    public static void main(String[] args) {
        
        // int[] arr1={2,6,8};
        // int[] arr2={1,3,5,6,7,9,10};
        
        int arr1[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int arr2[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

        ArrayList<Integer> res=new ArrayList<>();
        Union u=new HashSetMethod();
        res=u.union(arr1, arr2);
        System.out.println(res);
        

    }
    
}
