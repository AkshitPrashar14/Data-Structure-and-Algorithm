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
    public int maxDepth(TreeNode root) {
        // List<List<Integer>> result = new ArrayList<>();
        // if (root == null) return 0;

        // Queue<TreeNode> q = new LinkedList<>();
        // q.offer(root);
        // int maxDepth=0;
        // while (!q.isEmpty()) {
        //     int size = q.size();
        //     List<Integer> level = new ArrayList<>();

        //     for (int i = 0; i < size; i++) {
        //         TreeNode node = q.poll();
        //         level.add(node.val);

        //         if (node.left != null) q.offer(node.left);
        //         if (node.right != null) q.offer(node.right);
        //     }

        //     result.add(level);
        //     maxDepth++;
        // }

        // return maxDepth;

        if(root==null)return 0;
        int lh= maxDepth(root.left);
        int rh= maxDepth(root.right);
        int height= 1 + Math.max(lh,rh);
        return height;
    }
}
