import java.util.*;
class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int zeroes=0;
        for(int k=0; k<n; k++){
            if(arr[k]==0){
                zeroes++;
            }
        }
        int i=n-1;
        int j=n+zeroes-1;
        while(i>=0 && j>=0){
            if(j<n){
                arr[j]=arr[i];
            }
            if(arr[i]==0){
                j--;
            if(j<n){
                arr[j]=0;
            }
        }
        i--;
        j--;
    }
}
}