import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        //Brute Force
                //Arrays.sort(nums);
       // for (int i = 0; i < nums.length - 1; i += 2) {
        //    if (nums[i] != nums[i + 1]) {
//return nums[i];
          //  }
     //   }
//return nums[nums.length-1];  
//OPTIMISED
 int ans=0; 
 for(int i=0; i<nums.length; i++){
    ans=ans^nums[i];
 }
 return ans;
    }
}