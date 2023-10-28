class Solution {
    public int removeDuplicates(int[] nums)
     {

        //iterate 
        //compaire and chek 
        //
            int count = 1;
        for(int i=1; i<nums.length; i++)
        {
            
             if(nums[i] != nums[count-1])
              { 
                 nums[count] = nums[i];
                  count++;
        
              }
        
       
        }
         return count++;
    }


}





// class Solution {
//     public int removeDuplicates(int[] nums) {
//       int insertIndex =1;
//         for(int i=1; i<nums.length; i++)
//         {
//             if(nums[i-1]!=nums[i])
//             {
//                 nums[insertIndex] = nums[i];
//                 insertIndex++;
//             }
//         } return insertIndex;
//     }
// }