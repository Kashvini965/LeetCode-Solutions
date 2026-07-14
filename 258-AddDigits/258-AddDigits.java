// Last updated: 7/14/2026, 2:03:49 PM
class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
           int temp=num%10;
           sum+=temp;
           num=num/10;
            while(sum>=10 && num==0){
             num=sum;
             sum=0;
           }
        }
        
       
        return sum;
    }
}