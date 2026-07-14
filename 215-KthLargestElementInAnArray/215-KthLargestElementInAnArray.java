// Last updated: 7/14/2026, 2:03:59 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int num:nums){
            q.offer(num);
            if(q.size()>k){
              q.poll();
           }
        }
        return q.peek();
    }
}