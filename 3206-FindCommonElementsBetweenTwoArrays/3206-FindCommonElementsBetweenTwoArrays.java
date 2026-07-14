// Last updated: 7/14/2026, 2:01:55 PM
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int answer1 = 0;
        int answer2 = 0;

        // Count for nums1 -> exists in nums2
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    answer1++;
                    break; // move to next nums1 element
                }
            }
        }

        // Count for nums2 -> exists in nums1
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    answer2++;
                    break; // move to next nums2 element
                }
            }
        }

        return new int[]{answer1, answer2};
    }
}
