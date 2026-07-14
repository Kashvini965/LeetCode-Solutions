// Last updated: 7/14/2026, 2:01:48 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
       
        int single =0;
        int doubleS =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                single+=nums[i];
            }else{
                doubleS+=nums[i];
            }
        }
        return single!=doubleS;
    }
}