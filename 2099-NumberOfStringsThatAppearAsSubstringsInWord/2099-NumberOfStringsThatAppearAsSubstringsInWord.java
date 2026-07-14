// Last updated: 7/14/2026, 2:02:36 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String s:patterns){
            if(word.contains(s)){
                count++;
            }
            
        }
        return count;
    }
}