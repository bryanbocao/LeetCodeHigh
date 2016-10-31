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
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }

    public int helper(TreeNode node, int sum){
        if(node==null) return 0;
        if(node.left==null && node.right==null) return sum*10+node.val;
        return helper(node.left,sum*10+node.val)+helper(node.right,sum*10+node.val);
    }
}

//my solution
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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        int[] res = new int[1];
        dfs(root,res,0);
        return res[0];
    }

    public void dfs(TreeNode node, int[] res, int path){
        if(node==null) return;
        path = path*10+node.val;
        if(node.left==null && node.right==null){
            res[0]+=path;
            path=(path-node.val)/10;
            return;
        }else{
            dfs(node.left,res,path);
            dfs(node.right,res,path);
        }
        path=(path-node.val)/10;
    }
}