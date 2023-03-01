package arraylist;

import java.util.ArrayList;

public class DoubleArrayNumber {


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


      

        arr.stream().forEach(s->System.out.println(2*s));



    }
    
}
