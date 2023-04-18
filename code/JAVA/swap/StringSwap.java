package swap;

public class StringSwap {


    public static void main(String[] args) {
        

        String str="sagar";
        System.out.println(str);
        str = swap(str, 0, 1);
        System.out.println(str);

    }
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    
    
}
