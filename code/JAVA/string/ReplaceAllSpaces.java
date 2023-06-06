package string;

public class ReplaceAllSpaces {


    public static void main(String[] args) {
        String str=" I am sagar  Kumar";
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
            {
                ch[i]='@';
            }
        }
        System.out.println(new String(ch));

    }
    
}
