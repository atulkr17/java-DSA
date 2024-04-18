import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a array size");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array number");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void bubblesort(int []nums)
    {
        //run the steps n-1 time
        for(int i=0;i<nums.length;i++)
        {
            //for each stap , mex item will come of last index respective index
            for(int j=0;j<nums.length-1-i;j++)
            {
                //swap if item is smaller then the previous item
                if(nums[j]>nums[j+1])
                {
                    //swap
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        /* 
        System.out.println("After sorting");
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        */
        
        
    }
}
