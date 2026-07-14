// Last updated: 7/14/2026, 2:04:18 PM
class Solution {
    public int maxDepth(TreeNode root) {
     if(root==null) return 0;
        int left = maxDepth(root.left);
        int right= maxDepth(root.right);
        return 1+Math.max(left,right);
        
        
            
    }
}