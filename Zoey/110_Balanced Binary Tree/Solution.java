/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Based on definition
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left = depth(root.left);
        int right = depth(root.right);
        if(Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right)) return true;
        return false;
    }

    public int depth(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}

//Based on DFS
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return DFS(root)!=-1;
    }

    public int DFS(TreeNode node){
        if(node==null) return 0;
        int left = DFS(node.left);
        if(left==-1) return -1;
        int right = DFS(node.right);
        if(right==-1) return -1;
        if(Math.abs(left-right)<=1) return Math.max(left,right)+1;
        else return -1;
    }
}