package array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {


    public static void main(String[] args) {

        int[] nums={1,2,3,1,3,0,1,2};
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
    }
}
