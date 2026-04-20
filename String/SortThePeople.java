
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
        // Pair banate hain
        Integer[] idx = new Integer[n];
        for(int i = 0; i < n; i++) {
            idx[i] = i;
        }
        
        // Sort based on heights (descending)
        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);
        
        // Answer array
        String[] ans = new String[n];
        for(int i = 0; i < n; i++) {
            ans[i] = names[idx[i]];
        }
        
        return ans;
    }
}
