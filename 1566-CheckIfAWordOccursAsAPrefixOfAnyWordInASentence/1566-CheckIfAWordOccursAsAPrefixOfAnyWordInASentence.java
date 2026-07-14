// Last updated: 7/14/2026, 2:02:56 PM
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s=sentence.trim().split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].startsWith(searchWord)){
                return i+1;
            }
            
        }
        return -1;
    }
}