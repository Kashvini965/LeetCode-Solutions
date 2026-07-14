// Last updated: 7/14/2026, 2:04:55 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl = 0;
        Set<Character> set = new HashSet<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxl = Math.max(maxl, i - start + 1);
        }
        return maxl;  
    }
}