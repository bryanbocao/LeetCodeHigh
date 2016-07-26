/**
https://leetcode.com/problems/same-tree/
100. Same Tree My Submissions QuestionEditorial Solution
Total Accepted: 134492 Total Submissions: 308303 Difficulty: Easy
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
package algorithms.num100_SameTree;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if ((p == null && q != null) || (p != null && q == null)) return false;
    	else if (p.val != q.val) return false;
        else {
        	boolean sameTree = true;
        	
        	if ((p.left != null && q.left == null) || 
        			(p.left == null && q.left != null)) return false;
        	if (p.left != null && q.left != null) sameTree = isSameTree(p.left, q.left);
        	if (!sameTree) return false;
        	
        	if ((p.right != null && q.right == null) || 
        			(p.right == null && q.right != null)) return false;
        	if (p.right != null && q.right != null) sameTree = isSameTree(p.right, q.right);
        	if (!sameTree) return false;
        	
        	return true;
        }
    }
}
//20160616Thu11:41 duration:17m59s68 Accepted @github.com/BryanBo-Cao