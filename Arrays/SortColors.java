import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(i<=k){
            if(nums[i]==0){
                swap(j,i,nums);
                i++;
                j++;
            }
            else if(nums[i]==2){
                swap(k,i,nums);
                k--;
            }
            else{
                 i++;
                 }
        }
        }
        public static void swap(int l,int m,int[]arr){
            int temp=arr[l];
            arr[l]=arr[m];
            arr[m]=temp;
        }
}


