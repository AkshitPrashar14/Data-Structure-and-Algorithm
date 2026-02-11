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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> list= new LinkedList<List<Integer>>();
        if(root==null) return list;
        queue.offer(root);
        boolean flag=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> sublist=new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                sublist.add(queue.poll().val);
            }
            if(flag==true){
                flag=false;
            }
            else{
                flag=true;
                Collections.reverse(sublist);
            }
            list.add(sublist);
        }
        return list;
    }
}
