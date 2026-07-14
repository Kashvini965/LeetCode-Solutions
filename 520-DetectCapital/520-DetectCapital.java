// Last updated: 7/14/2026, 2:03:25 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean cap=false;
        if(word.length()==0 || word.length()==1) return true;
        if(word.equals(word.toLowerCase())) return true;
        if(word.equals(word.toUpperCase())) return true;
        if(Character.isUpperCase(word.charAt(0))&& word.substring(1).equals(word.substring(1).toLowerCase())) return true;
        return false;
    }
}