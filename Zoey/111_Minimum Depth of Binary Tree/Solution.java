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
    private int res = Integer.MAX_VALUE;
    private int level = 0;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        dfs(root,level);
        return res;
    }

    public void dfs(TreeNode root, int level){
        if(root==null) return;
        dfs(root.left,level+1);
        if(root.left==null && root.right==null){
            res=Math.min(res,level+1);
        }
        dfs(root.right,level+1);
    }
}