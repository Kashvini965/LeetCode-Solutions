// Last updated: 7/14/2026, 2:02:39 PM
class Solution {
    public boolean isThree(int n) {
        boolean a=false;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }else{
                continue;
            }
        }
        if(count==3){
            return true;
        }
        return false;
    }
}