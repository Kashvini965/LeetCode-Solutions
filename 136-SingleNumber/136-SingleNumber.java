// Last updated: 7/14/2026, 2:04:14 PM
class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        for(int num:nums){
            count^=num;
                
          

        }
        
        return count;
       
              
           
    }
}