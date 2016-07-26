/**
https://leetcode.com/problems/minimum-depth-of-binary-tree/
111. Minimum Depth of Binary Tree My Submissions QuestionEditorial Solution
Total Accepted: 113681 Total Submissions: 366219 Difficulty: Easy
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
package algorithms.num111_MinimumDepthOfBinaryTree;

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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        else if (root.left == null && root.right == null) return 1;
        else {
        	int dl = 0, dr = 0;
        	if (root.left != null) dl = minDepth(root.left) + 1;
        	if (root.right != null) dr = minDepth(root.right) + 1;
        	
        	if (dl == 0) return dr;
        	if (dr == 0) return dl;
        	
        	if (dl < dr) return dl;
        	else return dr;
        }
    }
}
//20160704Mon18:01 duration:8m08s97 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao