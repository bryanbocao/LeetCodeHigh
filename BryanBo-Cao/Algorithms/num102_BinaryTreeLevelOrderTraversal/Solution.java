/**
https://leetcode.com/problems/binary-tree-level-order-traversal/
102. Binary Tree Level Order Traversal  QuestionEditorial Solution  My Submissions
Total Accepted: 111326 Total Submissions: 330230 Difficulty: Easy
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 */
package algorithms.num102_BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
    	lsls = new ArrayList<List<Integer>>();
        if (root != null) {
            List<TreeNode> lastLevelTNLs = new ArrayList<TreeNode>();
            lastLevelTNLs.add(root);
            List<Integer> intLs = new ArrayList<Integer>();
            intLs.add(root.val);
            lsls.add(intLs);
            traverse(lastLevelTNLs);
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
//20160707Thu13:34 duration:1m54s93 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao