// Last updated: 7/14/2026, 2:04:10 PM
class Solution {
    public String reverseWords(String s) {
        String[] s1=s.trim().split("\\s+");
        StringBuilder str=new StringBuilder();
        for(int i=s1.length-1;i>=0;i--){
           str.append(s1[i]);
           if(i!=0){
            str.append(" ");
           }
        }
        return str.toString();
    }
}