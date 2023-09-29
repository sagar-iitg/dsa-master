package string;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        char[][] arr=new char[str.length][];

        for(int i=0;i<str.length;i++)
        {
           arr[i]=str[i].toCharArray();
        }
        System.out.println(Arrays.deepToString(arr));

        char[][] transpose=new char[arr[0].length][arr.length];

        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                transpose[i][j]=arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(transpose));



    }
}
