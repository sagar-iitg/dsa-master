package assignement.week5;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {


    public static void main(String[] args) {

        String s = "ab";
        String t = "a";
        boolean ans=isAnagram(s,t);
        System.out.println(ans);


    }
    public static boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> h=new HashMap<>();
        for(char i:t.toCharArray())
        {
            if(h.containsKey(i))
            {
                h.put(i,h.get(i)+1);

            }
            else{
                h.put(i,1);
            }
        }

        System.out.println(h);

        for(char i:s.toCharArray())
        {
            if(h.containsKey(i))
            {
                int x=h.get(i);
                h.put(i,x-1);
            }
            else{
                return false;
            }

        }

        System.out.println(h);
        for(Map.Entry<Character,Integer> i:h.entrySet())
        {
            if(i.getValue()!=0)
            {
                return false;
            }
        }

        //System.out.println(h);

        return true;

    }
}
