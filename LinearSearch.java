import java.util.Scanner;

public class LinearSearch {
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
        System.out.println("Enter a target number");
        int target=sc.nextInt();
        int ans =search(nums,target);
        System.out.println(ans);

        
        

        
    }
    static int search(int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
      for(int index=0;index<arr.length;index++)
      {
        
        if(arr[index]==target)
        {
            return index;
        }
      }
      return -1;
    }
}
