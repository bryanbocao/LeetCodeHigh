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
    public int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0],res[1]);
    }

    public int[] helper(TreeNode node){
        int[] res = new int[2];
        if(node==null) return res;
        int[] left = helper(node.left);
        int[] right = helper(node.right);
        res[0] = node.val+left[1]+right[1];
        res[1] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return res;
    }
}