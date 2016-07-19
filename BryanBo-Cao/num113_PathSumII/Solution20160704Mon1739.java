/**
https://leetcode.com/problems/path-sum/
112. Path Sum My Submissions QuestionEditorial Solution
Total Accepted: 110011 Total Submissions: 346971 Difficulty: Easy
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
package algorithms.num113_PathSumII;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution20160704Mon1739 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> pathsls = new ArrayList<List<Integer>>();
        if (root != null) {
        	if (root.left == null && root.right == null && sum == root.val) {
        		List<Integer> pathls = new ArrayList<Integer>();
        		pathls.add(root.val);
        		return true;
        	}
    		else {
    			if (root.left != null) {
    	       		hasPathSum = hasPathSum(root.left, sum - root.val);
    	        	if (hasPathSum) return true;
    	        }
    	        if (root.right != null) {
    	        	System.out.println(sum - root.val);
    	        	hasPathSum = hasPathSum(root.right, sum - root.val);
    	        	if (hasPathSum) return true;
    	        }
    	        return hasPathSum;
    		}
        	
        	List<List<Integer>> pathslsL = null, pathslsR = null;
        	if (root.left != null) pathslsL = getPathSum(root.left, sum - root.val);
        	pathsls.addAll(pathslsL);
        	if (root.right != null) pathslsR = getPathSum(root.right, sum - root.val);
        	pathsls.addAll(pathslsR);
        	
        }
        return pathsls;
    }
	
    public static List<Integer> getPathSum(TreeNode root, int sum) {
    	boolean hasPathSum = false;
    	if (root == null) return false;
    	else {
    		if (root.left == null && root.right == null && sum == root.val) return true;
    		else {
    			if (root.left != null) {
    	       		hasPathSum = hasPathSum(root.left, sum - root.val);
    	        	if (hasPathSum) return true;
    	        }
    	        if (root.right != null) {
    	        	System.out.println(sum - root.val);
    	        	hasPathSum = hasPathSum(root.right, sum - root.val);
    	        	if (hasPathSum) return true;
    	        }
    	        return hasPathSum;
    		}
    	}
    }
}
//20160704Mon17:39 duration:28m14s54 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao