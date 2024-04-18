import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size");
        int n=sc.nextInt();
        System.out.println("Enter a array size");
        int []nums=new int[n];
        for(int i=0;i<n;i++)
        {
          nums[i]=sc.nextInt();
        }
        System.out.println("Enter target number");
        int target=sc.nextInt();
        System.out.println(Binarysearch(nums,target));
        
    }
    static int Binarysearch(int []nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target>mid)
            {
                start=mid+1;
            }
            else if(target<mid){
              end=mid-1;  
            }
            else
            {
                return mid;
            }

        }
        return -1;

    }
}
