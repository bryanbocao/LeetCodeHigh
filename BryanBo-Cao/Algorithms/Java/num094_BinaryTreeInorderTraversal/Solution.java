/**
https://leetcode.com/problems/binary-tree-inorder-traversal/
94. Binary Tree Inorder Traversal My Submissions QuestionEditorial Solution
Total Accepted: 130019 Total Submissions: 322650 Difficulty: Medium
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?
 */
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
//20160617Fri16:14 duration:7m38s18 @github.com/BryanBo-Cao