/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution1 {

    public int kthSmallest(TreeNode root, int k) {
        int left = count(root.left);
        if(k<=left) return kthSmallest(root.left,k);
        else if(k>left+1) return kthSmallest(root.right,k-1-left);
        return root.val;
    }

    public int count(TreeNode node){
        if(node==null) return 0;
        return 1+count(node.left)+count(node.right);
    }

}