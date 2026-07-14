// Last updated: 7/14/2026, 2:03:54 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        return (n%2==0) && isPowerOfTwo(n/2);
    }
}