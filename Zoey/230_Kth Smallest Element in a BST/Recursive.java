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

    private static int count=0;
    private static int number=0;

    public int kthSmallest(TreeNode root, int k) {
        count=k;
        helper(root);
        return number;
    }

    public void helper(TreeNode node){
        if(node.left!=null) helper(node.left);
        count--;
        if(count==0){
            number=node.val;
            return;
        }
        if(node.right!=null) helper(node.right);
    }
}