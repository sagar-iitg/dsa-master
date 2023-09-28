package array;

import java.util.Arrays;

public class Example1 {


    public static void main(String[] args) {
        
        int[] arr={10,20,30,0,-2};

        for (int index: arr) {
           System.out.println(index);
            
        }

        Arrays.stream(arr).forEach(System.out::println);


        System.out.println(Arrays.toString(arr));
     

    }

    
}
