// Last updated: 7/14/2026, 2:03:37 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long i=1;
        boolean s=false;
        while(i*i<=num){
            if(i*i==num){
                return true;
            }
            i++;
        }
        return false;
    }
}