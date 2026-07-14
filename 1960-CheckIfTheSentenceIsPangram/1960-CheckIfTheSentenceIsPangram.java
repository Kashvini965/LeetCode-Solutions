// Last updated: 7/14/2026, 2:02:41 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen=new boolean[26];
        for(char c:sentence.toCharArray()){
            seen[c-'a']=true;
        }
        for(boolean b:seen){
            if(!b) return false;
            
        }
        return true;    
    }
}