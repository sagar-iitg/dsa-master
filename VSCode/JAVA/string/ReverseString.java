package string;

class ReverseString{


    public static void main(String[] args) {
    
        
        String str="vinay";
        String str1=solve(str);
        System.out.println(str1);

    }

    static String solve(String str)
    {
            int n=str.length();
            int i=0;
            int j=n-1;
            while(i<=j)
            {
                char temp=str.charAt(i);
                str.charAt(j)=str.charAt(i);


                i++;
                j--;

            }


        return str;
    }

    static void swap(int i,int j)
    {
        int temp=i;
        i=j;
        j=temp;
    }

}