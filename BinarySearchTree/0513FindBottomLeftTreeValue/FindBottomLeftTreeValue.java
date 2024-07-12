/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindBottomLeftTreeValue {
     int val = 0;
      int depth= -1;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,  0);
        return val;
    }
     
     private void dfs(TreeNode node, int currentDepth){
        if(null == node) return;
        if(depth<currentDepth){
            depth = currentDepth;
            val = node.val;
        }
        dfs(node.left,  currentDepth+1);
        dfs(node.right,  currentDepth+1);
        
     }
}
