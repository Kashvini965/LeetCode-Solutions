// Last updated: 7/14/2026, 2:01:59 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        int num=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
              num+=i;
            }else{
              sum+=i;
            }
           
        }
    return sum-num;
    }
}