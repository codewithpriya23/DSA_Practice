import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b [0]));
        ArrayList <int[]> ans = new ArrayList<>();
        for(int []arr:intervals){
            if(ans.size()==0){
                ans.add(arr);
            }
            else if(ans.get(ans.size()-1)[1]>=arr[0]){
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],arr[1]);}
                else{
                    ans.add(arr);
                }
            }
        int last[][]=new int [ans.size()][2];
        for(int i=0; i<ans.size(); i++){
            last[i]=ans.get(i);
        }
        return last;
    } 
}
