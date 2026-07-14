// Last updated: 7/14/2026, 2:04:28 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        return str[str.length-1].length();
    }
}