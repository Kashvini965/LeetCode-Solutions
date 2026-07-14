// Last updated: 7/14/2026, 2:03:06 PM
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==2 || n==1) return 1;
        int t0=0;
        int t1=1;
        int t2=1;
        for(int i=3;i<=n;i++){
            int t3=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=t3;
        }
        return t2;
    }
}