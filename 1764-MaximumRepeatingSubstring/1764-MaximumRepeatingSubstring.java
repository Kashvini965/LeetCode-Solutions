// Last updated: 7/14/2026, 2:02:50 PM
class Solution {
    public int maxRepeating(String sequence, String word) {
        String a=word;
        int count=0;
        while(sequence.contains(a)){
            count++;
            a=a+word;
        }
        return count;
    }
}