// Last updated: 7/14/2026, 2:01:41 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n*2];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            arr[i+n]=nums[n-i-1];
        }
        return arr;
    }
}