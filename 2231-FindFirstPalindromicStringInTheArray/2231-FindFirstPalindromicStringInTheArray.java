// Last updated: 7/14/2026, 2:02:27 PM
class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
          if(isPalindrome(word)){
            return word;
          }
        }
        return "";
    }
    private boolean isPalindrome(String words){
        int left=0, right=words.length()-1;
        while(left<right){
            if(words.charAt(left)!=words.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}