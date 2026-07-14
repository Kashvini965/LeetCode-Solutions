// Last updated: 7/14/2026, 2:04:36 PM
class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();

        for (int i = 0; i + len <= haystack.length(); i++) {
            if (haystack.substring(i, i + len).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
    
}