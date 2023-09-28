package array.union;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetMethod implements Union {
      
    @Override
    public ArrayList<Integer> union(int[] arr1,int[] arr2) {

        Set<Integer> s=new HashSet<>();

        for (Integer integer : arr1) {
           s.add(integer);
            
        }

        for (Integer integer : arr2) {
            s.add(integer);
             
         }
         ArrayList<Integer> res=new ArrayList<>(s);
        return res;

        
        
    }
    
}
