// Last updated: 7/14/2026, 2:02:31 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String op : operations) {
            if (op.charAt(1) == '+') {
                result++;
            } else {
                result--;
            }
        }

        return result;
    }
}