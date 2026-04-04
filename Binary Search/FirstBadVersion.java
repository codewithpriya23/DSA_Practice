import java.util.*;
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first=0; 
        int last=n;
         int mid=0;
        int ans=-1;
        while(first<=last){
            mid=first+(last-first)/2;
            if(isBadVersion(mid)){
                ans=mid;
                last=mid-1;
            }else{
                first=mid+1;
            }
        }
        return ans;
    }
}