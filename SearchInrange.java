import java.util.Scanner;

public class SearchInrange {
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
        System.out.println(search(nums,target,1,4));
        
    }
    static int search(int arr[],int target,int start, int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
      for(int index=start;index<end;index++)
      {
        
        if(arr[index]==target)
        {
            return index;
        }
      }
      return -1;
    }
}
