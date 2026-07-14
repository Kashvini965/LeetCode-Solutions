// Last updated: 7/14/2026, 2:01:44 PM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        long ans=0;
        for(int i=0;i<nums.length;i++){
                int count=0;
                for(int j=i;j<n;j++){
                    if(nums[j]==target) count++;
                    int len=j-i+1;
                    if(2*count>len)
                      ans++;
                }
        }
        return(int) ans;
    }
}