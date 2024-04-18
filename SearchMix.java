import java.util.Scanner;

public class SearchMix {
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
        System.out.println("mix is"+mix(nums));
    }
    static int mix(int arr[])
    {
        int ans=arr[0];
       for(int i=0;i<arr.length;i++)
       {
       
        if(ans<arr[i])
        {
           ans=arr[i];
        }
        
        
       }
       return ans;
    }
}
