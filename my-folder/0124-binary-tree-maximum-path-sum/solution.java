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
    int maximum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        height(root);
        return maximum;
    }
    private int height(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, height(node.left));
        int right = Math.max(0, height(node.right));
        maximum = Math.max(maximum, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
