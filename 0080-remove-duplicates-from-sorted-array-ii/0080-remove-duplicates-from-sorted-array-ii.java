class Solution {
    public int removeDuplicates(int[] nums) {
        
//if the no prsent more than count 2 then we dont have need to store it
      int j = 2; 
      for(int i = 2; i<nums.length; i++) // j = 1. i=1 xount ++ ; 
      {
        if(nums[i] != nums[j-2]) 

        {
           nums[j] = nums[i];
           j++;
        }
          
      }
           return j;

    }
}