/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//recursive dfs
public class Solution {
    int max;
    public int longestConsecutive(TreeNode root) {
        if(root==null) return 0;
        helper(root, 0, root.val);
        return max;
    }

    public void helper(TreeNode root,int len, int target){
        if(root==null) return;
        if(root.val==target) len++;
        else len = 1;
        max = Math.max(max, len);
        helper(root.left,len, root.val+1);
        helper(root.right,len, root.val+1);
    }
}