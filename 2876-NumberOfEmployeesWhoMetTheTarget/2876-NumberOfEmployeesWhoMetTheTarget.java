// Last updated: 7/14/2026, 2:02:03 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int num:hours){
            if(num>=target){
                count++;
            }
        }
        return count;
    }
}