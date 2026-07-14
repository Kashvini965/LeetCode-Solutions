// Last updated: 7/14/2026, 2:02:14 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
          sum+=nums[i];
        }
        Arrays.sort(nums);
        int digit=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>9){
                while(nums[i]>0){
                  digit+=nums[i]%10;
                  nums[i]/=10;
                }
            }else{
               digit+=nums[i];
            }
        } 
        int ans=digit>sum?digit-sum:sum-digit; 
        return sum - digit;
       
    }
}