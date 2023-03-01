package arraylist;


import java.util.ArrayList;

public class MaxNumber {


    public static void main(String[] args) {
        
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(1);
        arr.add(-20);
        arr.add(-30);
        arr.add(2000);
        arr.add(-20);
        arr.add(-20);
        arr.add(-20);
        arr.add(-20);
        arr.add(100);

       // arr.forEach(System.out::println);
        
        
        Integer ans=arr.stream().max(Integer::compare).get();
         System.out.println(ans);

    }
    
}
