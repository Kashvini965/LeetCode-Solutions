// Last updated: 7/14/2026, 2:02:19 PM
class Solution {
    public int commonFactors(int a, int b) {
        int count=1;
        for(int i=2;i<=b;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}