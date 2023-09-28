package array;

public class FindUniqueElement {



    public static void main(String[] args) {
        

        int[] arr={1,2,4,2,1,3,6,5,5,6,4};
        int ans=solution(arr);
        System.out.println(ans);
     }

    private static int solution(int[] arr) {



        int res=0;

        for(int index=0;index<arr.length;index++)
        {
                res=res^arr[index];
        }
        return res;
    }
    
}
