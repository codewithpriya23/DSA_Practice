package Sliding Window;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!dq.isEmpty() && dq.peek()==i-k){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
    dq.pollLast();
}
dq.offer(i);
if(i>=k-1){
    ans.add(nums[dq.peek()]);
}
        }
        int[]result=new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}
