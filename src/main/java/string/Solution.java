package string;

import java.util.Arrays;

class Solution {

    // Method to transpose a 2D character array
    public static char[][] transpose2DCharArray(char[][] charArray) {
        int rows = charArray.length;
        int cols = charArray[0].length;

        char[][] transposedArray = new char[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = charArray[i][j];
            }
        }

        return transposedArray;
    }

     public static char[][] convertTo2DCharArray(String[] stringArray) {
        int rows = stringArray.length;
        int maxCols = 0;

        // Find the maximum length of a string in the array
        for (String str : stringArray) {
            if (str.length() > maxCols) {
                maxCols = str.length();
            }
        }

        // Create a new 2D character array
        char[][] charArray = new char[rows][maxCols];

        // Fill the 2D character array with characters from strings
        for (int i = 0; i < rows; i++) {
            String str = stringArray[i];
            for (int j = 0; j < str.length(); j++) {
                charArray[i][j] = str.charAt(j);
            }
        }

        return charArray;
    }
   
    public static String longestCommonPrefix(String[] strs) {
        
            char[][] arr1=convertTo2DCharArray(strs);
            char[][] arr=transpose2DCharArray(arr1);
           System.out.println(Arrays.deepToString(arr1));

            StringBuilder ans=new StringBuilder("");
            
            for(int i=0;i<arr.length;i++)
            {
                boolean flag=false;
                char ch=arr[i][0];
                System.out.println(ch);

                for(int j=0;j<arr[i].length;j++)
                {
                    if(ch!=arr[i][j]){
                            flag=true;
                    }

                }
                if(!flag)
                    ans.append(ch);
            }
            return ans.toString();

          


    }

    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        String st=longestCommonPrefix(str);
        System.out.println(st);

    }
}