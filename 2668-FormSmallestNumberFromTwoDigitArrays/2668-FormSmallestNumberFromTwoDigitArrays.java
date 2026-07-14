// Last updated: 7/14/2026, 2:02:11 PM
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min1 = 10, min2 = 10;
        int common = 10;

        
        for (int x : nums1) {
            min1 = Math.min(min1, x);
        }

        for (int y : nums2) {
            min2 = Math.min(min2, y);

            
            for (int x : nums1) {
                if (x == y) {
                    common = Math.min(common, x);
                }
            }
        }

        if (common < 10) return common; 
        return Math.min(min1 * 10 + min2, min2 * 10 + min1);
    }
}
