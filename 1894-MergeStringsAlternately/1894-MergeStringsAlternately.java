// Last updated: 7/14/2026, 2:02:44 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sbr=new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if (i<word1.length()){
              sbr.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sbr.append(word2.charAt(i));
            }
            i++;
        }
        
        return sbr.toString();
    }
}