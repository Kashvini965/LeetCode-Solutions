// Last updated: 7/14/2026, 2:03:38 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int count=0;
        int a[]=new int[Math.min(n,m)];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                  a[count] =nums1[i];
                  count++;
                  nums2[j] = Integer.MIN_VALUE; 
                  break;
                }
            }
        }
        int res[] =new int[count];
        for(int i=0;i<count;i++){
        res[i]+=a[i];
        }
        return res;
    }
}