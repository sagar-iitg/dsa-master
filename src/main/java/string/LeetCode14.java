package string;

class LeetCode14 {
    public static String longestCommonPrefix(String[] strs) {


        String ans="";
        for(int i=0;i<strs.length;i++)
        {
            if(strs[0].isEmpty()) return ans;
            char ch=strs[0].charAt(i);
            boolean match=true;


            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].length()<i ){
                    if( ch!=strs[j].charAt(i))
                    {
                        match=false;
                        break;
                    }

                }

            }

            if(match==false) break;
            else ans=ans+ch;

        }
        return ans;
    }

    public static void main(String[] args) {
        String[] str={"ab","a"};
        System.out.println(longestCommonPrefix(str));
    }
}