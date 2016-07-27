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
    public int countNodes(TreeNode root) {
        int h = height(root);
        if(h<0) return 0;
        else{
            int right = height(root.right);
            if(right==h-1) return (1<<h)+countNodes(root.right);
            else return (1<<h-1)+countNodes(root.left);
        }
    }

    public int height(TreeNode node){
        if(node==null) return -1;
        return 1+height(node.left);
    }
}