// Last updated: 7/14/2026, 2:01:57 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l=new ArrayList<> ();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                l.add(i);
            }
        }
        return l;
    }
}