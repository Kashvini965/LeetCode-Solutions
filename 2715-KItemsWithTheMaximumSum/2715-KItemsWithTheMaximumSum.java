// Last updated: 7/14/2026, 2:02:09 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int one = Math.min(numOnes, k);
        k -= one;
        int zero = Math.min(numZeros, k);
        k -= zero;
        int neg = k;
        return one - neg;
    }
}