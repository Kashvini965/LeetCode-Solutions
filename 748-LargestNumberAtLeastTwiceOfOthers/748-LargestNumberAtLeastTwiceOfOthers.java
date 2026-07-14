// Last updated: 7/14/2026, 2:03:13 PM
class Solution {
    public int dominantIndex(int[] nums) {
        int index=-1;
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                second=largest;
                largest=nums[i];
                index=i;
            }else if(nums[i]>second && nums[i]!=largest){
                second=nums[i];
            }
        }
        return largest>=2*second ? index: -1;
    }
}