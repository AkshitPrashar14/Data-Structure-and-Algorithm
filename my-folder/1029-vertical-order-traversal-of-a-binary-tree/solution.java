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
import java.util.*;

class Solution {
    class Pair {
        int val;
        int height;
        int vertical;
        Pair(int val, int height, int vertical) {
            this.val = val;
            this.height = height;
            this.vertical = vertical;
        }
    }

    List<List<Pair>> ans = new ArrayList<>();
    int x = 0; // shifting index for vertical columns

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Find minimum vertical index (leftmost column)
        x = -findMinVertical(root, 0);
        traverse(root, 0, 0);

        List<List<Integer>> finalAns = new ArrayList<>();
        for (List<Pair> column : ans) {
            List<Integer> colValues = new ArrayList<>();
            for (Pair p : column) {
                colValues.add(p.val);
            }
            finalAns.add(colValues);
        }
        return finalAns;
    }

    private int findMinVertical(TreeNode root, int vertical) {
        if (root == null) return Integer.MAX_VALUE;
        int leftMin = findMinVertical(root.left, vertical - 1);
        int rightMin = findMinVertical(root.right, vertical + 1);
        return Math.min(vertical, Math.min(leftMin, rightMin));
    }

    public void traverse(TreeNode root, int height, int vertical) {
        if (root == null) return;

        traverse(root.left, height + 1, vertical - 1);

        int idx = vertical + x;
        while (ans.size() <= idx) {
            ans.add(new ArrayList<>());
        }

        List<Pair> column = ans.get(idx);
        // Insert in sorted order by height, then val
        int insertPos = 0;
        while (insertPos < column.size()) {
            Pair p = column.get(insertPos);
            if (p.height > height) break;
            else if (p.height == height && p.val > root.val) break;
            insertPos++;
        }
        column.add(insertPos, new Pair(root.val, height, vertical));

        traverse(root.right, height + 1, vertical + 1);
    }
}
