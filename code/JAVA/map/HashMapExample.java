package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    

    public static void main(String[] args) {
        
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        map.put(10, 20);
        map.put(1000, 10);
        map.put(1, null);
        System.out.println(map.get(1));

        System.out.println(map.size());
        for(Map.Entry<Integer,Integer> i:map.entrySet())
        {
            System.out.println(i.getKey()+"--" +i.getValue());
        }        
    }
}
