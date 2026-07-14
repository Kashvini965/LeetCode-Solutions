// Last updated: 7/14/2026, 2:04:16 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
          if(prices[i]<min){
            min=prices[i];
          }
          int max=prices[i]-min;
          if(max>profit){
            profit=max;
          }
        } 
        return profit;
        
        
    }
}