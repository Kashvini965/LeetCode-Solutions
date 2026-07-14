// Last updated: 7/14/2026, 2:04:00 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean iso=false;
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
                if( s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(i))){
                    return false;
                }
            
        }
        return true;

    }
}