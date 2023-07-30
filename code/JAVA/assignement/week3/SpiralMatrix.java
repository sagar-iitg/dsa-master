package assignement.week3;

public class SpiralMatrix {


    public static void main(String[] args) {

        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int m=arr.length;
        int n=arr[0].length;

        int count=0;
        int totalNumber=m*n;

        int startCol=0;
        int endCol=n-1;
        int startRow=0;
        int endRow=m-1;

        while(count<totalNumber)
        {
            for(int i=startCol;i<=endCol&& count<totalNumber;i++)
            {
                System.out.print(arr[startRow][i]+" ");
                count++;

            }
            startRow++;

            for(int i=startRow;i<=endRow && count<totalNumber;i++)
            {
                System.out.print(arr[i][endCol]+" ");
                count++;
            }
            endCol--;
            for(int i=endCol;i>=startCol&& count<totalNumber;i--)
            {
                System.out.print(arr[endRow][i]+" ");
                count++;
            }

            endRow--;

            for(int i=endRow;i>=startRow && count<totalNumber;i--)
            {
                System.out.print(arr[i][startCol]+" ");
                count++;
            }
            startCol++;

        }

    }


}
