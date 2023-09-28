package array.sum;

public class Triplet {
    


    public static void main(String[] args) {
    
        int arr[]={10,20,40,60,70};


        int target=90;

        for(int i=0;i<arr.length;i++)
        {

            int element1=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {

                int element2=arr[j];
                for(int k=j+1;k<arr.length;k++)
                {
                    int element3=arr[k];
                    if(element1+element2+element3==target)
                    {
                            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
               
            }
        }

    }


    
}

