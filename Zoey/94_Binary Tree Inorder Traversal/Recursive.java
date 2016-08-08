/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(res,root);
        return res;
    }

    public void helper(List<Integer> list,TreeNode node){
        if(node==null) return;
        helper(list,node.left);
        list.add(node.val);
        helper(list,node.right);
    }
}