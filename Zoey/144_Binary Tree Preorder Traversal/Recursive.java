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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(list,root);
        return list;
    }

    public void helper(List<Integer> list, TreeNode node){
        if(node==null) return;
        list.add(node.val);
        helper(list,node.left);
        helper(list,node.right);
    }
}