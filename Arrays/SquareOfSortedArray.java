import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
         int n=nums.length;
        int left=0; 
        int right=n-1;
        int[] result=new int [n];
        int idx=n-1;
        while(left<=right){
            int leftSq=nums[left] *nums[left];
            int rightSq=nums[right] * nums[right];
            if(leftSq>rightSq){
                result[idx]=leftSq;
                left++;
            } else{
                result[idx]=rightSq;
                right--;
            }
            idx--;
        }
        return result;
    }
}