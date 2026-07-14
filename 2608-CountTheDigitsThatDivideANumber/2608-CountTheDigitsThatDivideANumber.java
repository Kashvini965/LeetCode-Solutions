// Last updated: 7/14/2026, 2:02:16 PM
class Solution {
    public int countDigits(int num) {
        int a=num;
        int count=0;
        while(num>0){
          int digit=num%10;
          if(a%digit==0 ){
            count++;
           
          }
          num/=10;
        }
        return count;
    }
}