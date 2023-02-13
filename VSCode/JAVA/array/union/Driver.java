package array.union;

import java.util.ArrayList;

public class Driver {


    public static void main(String[] args) {
        
        int[] arr1={2,6,8};
        int[] arr2={1,3,5,6,7,9,10};
        ArrayList<Integer> res=new ArrayList<>();
        Union u=new UnionOf2Array();
        res=u.union(arr1, arr2);
        System.out.println(res);
        

    }
    
}
