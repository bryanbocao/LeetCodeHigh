/**
https://leetcode.com/problems/maximum-depth-of-binary-tree/
104. Maximum Depth of Binary Tree My Submissions QuestionEditorial Solution
Total Accepted: 152048 Total Submissions: 314261 Difficulty: Easy
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
package algorithms.num104_MaximumDepthOfBinaryTree;

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
    public int maxDepth(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) return 1;
        	int leftMaxDepth = 0, rightMaxDepth = 0;
        	if (root.left != null) leftMaxDepth += maxDepth(root.left) + 1;
        	if (root.right != null) rightMaxDepth += maxDepth(root.right) + 1;
        	return leftMaxDepth > rightMaxDepth ? leftMaxDepth : rightMaxDepth;
        }
        return 0;
    }
}
//20160616Thu11:19 duration:7m13s81 Accepted @github.com/BryanBo-Cao