// Last updated: 7/14/2026, 2:03:42 PM
class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
           char k=s[l];
           s[l]=s[r];
           s[r]=k;
           l++;
           r--;
        }
    }
       
        
    
}