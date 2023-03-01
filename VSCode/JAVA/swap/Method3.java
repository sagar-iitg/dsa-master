package swap;

public class Method3 {

    public static void main(String[] args) {
        
        int x=11;
        int y=166;

        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x+" "+y);
    }
    
}
