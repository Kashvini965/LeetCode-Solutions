// Last updated: 7/14/2026, 2:02:21 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        int a=0;
        for(int i=0;i<n;i++){
            if(n%2==0){
               return n;
            }
        }  
        return n*2;
    }
}