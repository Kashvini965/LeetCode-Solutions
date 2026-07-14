// Last updated: 7/14/2026, 2:04:02 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int[] r=new int[nums.length];
        int n=nums.length;
        k=k%n;
        for(int i=0;i<nums.length;i++){
            r[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=r[i];
        }
        
    }
}