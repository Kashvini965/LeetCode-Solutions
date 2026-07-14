// Last updated: 7/14/2026, 2:03:27 PM
class Solution {
    public int countSegments(String s) {
        String[] str=s.split(" ");
        int count=0;
        for(String word:str){
            if(word.isEmpty()){
              continue;
            }else{
              count++;
            }
            
        }
        return count;
    }
}