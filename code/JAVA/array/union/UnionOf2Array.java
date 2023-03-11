package array.union;

import java.util.ArrayList;

public class UnionOf2Array implements Union{


    // public static void main(String[] args) {
        
    //     int[] arr1={10,5,4,3,2,2};
    //     int[] arr2={1,9,10,2,-1};

    //     ArrayList<Integer> res=new ArrayList<>();
    //     res=union( arr1, arr2);
    //     System.out.println(res);


    // }

    @Override
    public   ArrayList<Integer> union(int[] arr1,int[] arr2)
    {

        ArrayList<Integer> ans=new ArrayList<>();
           
            for(int i=0;i<arr1.length;i++)
            {
                boolean flag=false;

                for(int j=0;j<arr2.length;j++)
                {
                    if(arr1[i]==arr2[j])
                    {

                        flag=true;
                        ans.add(arr1[i]);
                        arr2[j]=Integer.MIN_VALUE;
                        break;

                    }
                    
                }
                if(!flag)
                    ans.add(arr1[i]);



             
            }


            for(int k=0;k<arr2.length;k++)
            {

                if(arr2[k]!=Integer.MIN_VALUE)
                {
                    ans.add(arr2[k]);
                }
            }

        return ans;


    }
    
}
