// Last updated: 7/14/2026, 2:02:23 PM
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String word:words){
            if(s.startsWith(word)){
                count++;
            }
        }
        return count;
    }
}