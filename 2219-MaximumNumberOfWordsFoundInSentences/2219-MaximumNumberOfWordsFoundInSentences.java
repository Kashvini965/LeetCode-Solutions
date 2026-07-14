// Last updated: 7/14/2026, 2:02:30 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
    int maxwords=0;

    for(String s:sentences){
        int wordcount=s.split(" ").length;
        maxwords=Math.max(maxwords,wordcount);
    }
    return maxwords;
    }
}