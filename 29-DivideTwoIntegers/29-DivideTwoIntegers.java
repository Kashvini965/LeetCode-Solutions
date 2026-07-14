// Last updated: 7/14/2026, 2:04:34 PM
class Solution {
    public int divide(int dividend, int divisor) {
        int a = dividend/divisor;
        String b=String.valueOf(a);
        if(dividend==Integer.MIN_VALUE && divisor==-1){
          return Integer.MAX_VALUE;
        }
        for(int i=0;i<b.length();i++){
          char ch=b.charAt(i);
          if(Character.isDigit(ch) && a>0){
            System.out.print(ch);
            break; 
          }
        
        }
        return a;
    }
}