/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
144. Binary Tree Preorder Traversal My Submissions QuestionEditorial Solution
Total Accepted: 125888 Total Submissions: 311270 Difficulty: Medium
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?
 */
package algorithms.num144_BinaryTreePreorderTraversal;
import java.util.*;

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
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> ls = new ArrayList<Integer>();
        if (root != null) {
        	ls.add(root.val);
        	if (root.left != null) ls.addAll(preorderTraversal(root.left));
        	if (root.right != null) ls.addAll(preorderTraversal(root.right));
        	root = null;
        }
        return ls;
    }
}
//20160615Wed16:43 duration:7m31s87 Accepted @github.com/BryanBo-Cao
