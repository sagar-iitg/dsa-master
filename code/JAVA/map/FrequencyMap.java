package map;

import java.util.HashMap;

public class FrequencyMap {


    public static void main(String[] args) {
        
        String str="sagar";
        HashMap<Character,Integer> map=new HashMap<>();
        System.out.println(map);
        for(int i=0;i<str.length();i++)
        {

            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
                continue;
            }
            map.put(ch, 1);
        }
        System.out.println(map);
    }
    
    
}
