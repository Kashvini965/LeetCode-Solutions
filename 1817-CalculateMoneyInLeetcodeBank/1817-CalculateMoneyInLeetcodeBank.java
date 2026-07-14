// Last updated: 7/14/2026, 2:02:46 PM
class Solution {
    public int totalMoney(int n) {
        int total=0;
        int current=1;
        int mon=1;
        for(int i=1;i<=n;i++){
            total+=current;
            if(i%7==0){
                mon++;
                current=mon;
            }else{
                current++;
            }
        }
        return total;
    }
}