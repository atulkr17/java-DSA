import java.util.Arrays;

class Cyclicsort
{
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        cyclesort(arr);
    System.out.println(Arrays.toString(arr));
        
    }
        static void  cyclesort(int []arr)
        {
            int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1; 
            if(arr[i]!=arr[correct])
            {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;  
            }
            else{
                i++;
            }
        }

        }
        /* 
        static void swap(int []arr,int first,int second)
        {
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
    */
   
   
   
 

}