import java.util.*;
class Solution {
    class Pair implements Comparable<Pair> {
        int key,freq;
        Pair(int key, int freq){
        this.key= key;
        this.freq= freq;
    }
    public int compareTo(Pair that){
        return this.freq-that.freq;
    }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
for (int key : map.keySet()) {
    pq.offer(new Pair(key, map.get(key)));
    if(pq.size()>k) pq.poll();
}
int ans[]=new int[pq.size()];
int i=0;
while(!pq.isEmpty()){
    Pair obj = pq.poll();
    ans[i++]=obj.key;
}
return ans;
    }
}