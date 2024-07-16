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
class RightViewBFS {
    // List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
        
        if (root == null) {
            return ans;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            TreeNode lastNode = null;

            for(int i = 0;i<level;i++){
                TreeNode node = queue.poll();
                lastNode = node;

                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            if(lastNode != null) ans.add(lastNode.val);
        }
        return ans;
    }
}
