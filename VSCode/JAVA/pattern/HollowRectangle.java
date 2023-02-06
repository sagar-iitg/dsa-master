public class HollowRectangle 
{

    public static void main(String[] args) 
    {
        hollow(4,5);
        
    }

    private static void hollow(int totalRow,int  totalCol) 
    {

        for(int rows=0;rows<totalRow;rows++)
        {
            for(int col=0;col<totalCol;col++)
            {

                if(rows==0 || rows==totalRow-1)
                {
                    System.out.print("* ");
                    continue;
                }
                else{
                    if(col==0 || col==totalCol-1)
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }


    }

    
}
