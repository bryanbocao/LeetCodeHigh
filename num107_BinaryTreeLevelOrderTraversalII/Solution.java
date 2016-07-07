/**
https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
107. Binary Tree Level Order Traversal II  QuestionEditorial Solution  My Submissions
Total Accepted: 86866 Total Submissions: 249343 Difficulty: Easy
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */
package algorithms.num107_BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
public class Solution {
	static List<List<Integer>> lsls = null;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	lsls = new ArrayList<List<Integer>>();
        if (root != null) {
            List<TreeNode> lastLevelTNLs = new ArrayList<TreeNode>();
            lastLevelTNLs.add(root);
            List<Integer> intLs = new ArrayList<Integer>();
            intLs.add(root.val);
            lsls.add(intLs);
            traverse(lastLevelTNLs);
            Collections.reverse(lsls);
        }
        return lsls;
    }
    
    private static void traverse(List<TreeNode> lastLevelTNLs) {
    	List<TreeNode> thisLevelTNLs = new ArrayList<TreeNode>();
    	List<Integer> thisLevelIntLs = new ArrayList<Integer>();
    	Iterator<TreeNode> it = lastLevelTNLs.iterator();
    	while (it.hasNext()) {
    		TreeNode tn = it.next();
    		if (tn.left != null) {
    			thisLevelTNLs.add(tn.left);
    			thisLevelIntLs.add(tn.left.val);
    		}
    		if (tn.right != null) {
    			thisLevelTNLs.add(tn.right);
    			thisLevelIntLs.add(tn.right.val);
    		}
    	}
    	if (!thisLevelTNLs.isEmpty()) {
    		lsls.add(thisLevelIntLs);
    		traverse(thisLevelTNLs);
    	}
    	
    }
}
//20160707Thu13:23 duration:18m43s04 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao