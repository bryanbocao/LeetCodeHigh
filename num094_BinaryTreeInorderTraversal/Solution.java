package algorithms.num094_BinaryTreeInorderTraversal;

import java.awt.List;

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
    	List<Integer> ls = new ArrayList<Integer>();
        if (root != null) {
        	if (root.left != null) ls.addAll(inorderTraversal(root.left));
        	ls.add(root.val);
        	if (root.right != null) ls.addAll(inorderTraversal(root.right));
        }
        return ls;
    }
}
//https://leetcode.com/problems/binary-tree-inorder-traversal/
//20160617Fri16:14 duration:7m38s18 @github.com/BryanBo-Cao