/**
https://leetcode.com/problems/balanced-binary-tree/
110. Balanced Binary Tree My Submissions QuestionEditorial Solution
Total Accepted: 118858 Total Submissions: 343924 Difficulty: Easy
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
package algorithms.num110_BalancedBinaryTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution20160704Mon1847 {
    public boolean isBalanced(TreeNode root) {
    	if (root == null) return true;
    	else {
    		int ld = depth(root.left);
    		int rd = depth(root.right);
    		System.out.println(ld);
    		System.out.println(rd);
    		if (Math.abs(ld - rd) > 1) return false;
    		if (root.left != null) return isBalanced(root.left);
    		if (root.right != null) return isBalanced(root.right);
    		return true;
    	}
    }
    
    private static int depth(TreeNode root) {
        if (root == null) return 0;
        else if (root.left == null && root.right == null) return 1;
        else {
        	int ld = 0, rd = 0;
        	if (root.left != null) ld = depth(root.left) + 1;
        	if (root.right != null) rd = depth(root.right) + 1;
        	if (ld == 0) return rd;
        	if (rd == 0) return ld;
        	if (ld > rd) return ld;
        	else return rd;
        }
    }
}
//20160704Mon18:47 duration:35m37s89 WrongAnser @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
/*
Your input

[1,2,2,3,3,null,null,4,4]
Your answer

true
Expected answer

false

     1
    / \
   2   2
  / \ / \
 3  n n 3
 /\/\/\/\
4 nn4

Your input

[1,2,3,4,5,null,6,7,null,null,null,null,8]
Your stdout

3
3
2
1
1
0
0
0
Your answer

true
Expected answer

false
     */
