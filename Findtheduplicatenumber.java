public class Findtheduplicatenumber {
    public static void main(String[] args) {
        int []arr={1,3,4,2,2};
       System.out.println(duplic(arr)); 
      
    }
    static int duplic(int []nums)
    {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=nums[i+1])
            {
                int correct=nums[i]-1; 
                if(nums[i]!=nums[correct])
                {
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;  
                }
                else{
                   return nums[i];
                }
                
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
