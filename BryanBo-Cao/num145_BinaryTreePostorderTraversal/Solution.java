/**
https://leetcode.com/problems/binary-tree-postorder-traversal/
145. Binary Tree Postorder Traversal My Submissions QuestionEditorial Solution
Total Accepted: 100866 Total Submissions: 280513 Difficulty: Hard
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?
 */
package algorithms.num145_BinaryTreePostorderTraversal;
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<Integer>();
        if (root != null) {
        	if (root.left != null) ls.addAll(postorderTraversal(root.left));
        	if (root.right != null) ls.addAll(postorderTraversal(root.right));
        	ls.add(root.val);
        }
        return ls;
    }
}
//20160615Wed16:52 duration:4m17s74 Accepted @github.com/BryanBo-Cao
