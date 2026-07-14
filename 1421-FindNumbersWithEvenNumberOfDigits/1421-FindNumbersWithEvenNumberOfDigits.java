// Last updated: 7/14/2026, 2:03:02 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int digits=0;
            while(a>0){
                a=a/10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}