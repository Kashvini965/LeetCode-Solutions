// Last updated: 7/14/2026, 2:03:35 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;     
        int[] Counter = new int[26];
        for (char ch : magazine.toCharArray()) {
            Counter[ch - 'a']++; 
        }
        for (char ch : ransomNote.toCharArray()) {
            int charCount = Counter[ch - 'a'];
            if (charCount <= 0) return false;

              Counter[ch - 'a']--; 
        }
        return true;
    }
}