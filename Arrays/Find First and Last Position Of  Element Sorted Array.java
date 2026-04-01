import java.util.*;
class Solution {
         public int Solve (int[]nums, int first, int last, int target,  boolean isStarting){
           int ans=-1;
            while(first<=last){
                int mid=first+(last-first)/2;
                if(nums[mid]==target) {
                    ans=mid;
                    if(isStarting){
                        last=mid-1;
                    }else{
                        first=mid+1;
                    }
                }
                    else if(nums[mid]<target){
                        first=mid+1;
                    } else{ 
                        last=mid-1;
                    }
            }
                return ans;
         }
        public int[] searchRange(int[] nums, int target) {
        int[] temp=new int[2];
        temp[0]=Solve(nums,0,nums.length-1,target,true);
        temp[1]=Solve(nums,0,nums.length-1,target,false);
        return temp;
    }
}