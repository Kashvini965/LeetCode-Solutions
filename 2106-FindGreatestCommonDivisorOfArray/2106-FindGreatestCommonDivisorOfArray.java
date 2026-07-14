// Last updated: 7/14/2026, 2:02:34 PM
class Solution {
    public int findGCD(int[] nums) {
       int min=nums[0];
       int max=nums[0];
       for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
        }else if(nums[i]>max){
            max=nums[i];
        }
       } 
        int g=1;
        for(int i=2;i<=max;i++ ){
            if(min%i==0 && max%i==0){
              g=i;
            }
            
        }
        if(g==1){
          return 1;
        }
        return g;
    }
}