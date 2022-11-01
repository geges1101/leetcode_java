import javax.swing.tree.TreeNode;

public class Main {
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
    class Solution {
        public int addPath(TreeNode node){
            if(node == null) return 0;
            int left = Math.max(0, addPath(node.left));
            int right = Math.max(0, addPath(node.right));
            max = Math.max(max, left + right + node.val);
            return Math.max(left, right) + node.val;
        }

        int max;
        public int maxPathSum(TreeNode root) {
            max = Integer.MIN_VALUE;
            addPath(root);
            return max;
        }
    }
}