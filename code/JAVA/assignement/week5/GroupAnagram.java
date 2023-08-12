package assignement.week5;

import java.util.*;

public class GroupAnagram {


    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};

        List<List<String>> res=groupAnagrams(strs);
        System.out.println(res);

    }
    public static List<List<String>>  groupAnagrams(String[] strs) {


        Map<String,List<String>> map=new HashMap<>();


        for(String str:strs)
        {

            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());

            }

            map.get(sortedWord).add(str);

        }
        System.out.println(map);
        return new ArrayList<>(map.values());

    }
}
