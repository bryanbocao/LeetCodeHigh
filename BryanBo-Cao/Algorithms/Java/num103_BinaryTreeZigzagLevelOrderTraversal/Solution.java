/**
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
103. Binary Tree Zigzag Level Order Traversal  QuestionEditorial Solution  My Submissions
Total Accepted: 65172 Total Submissions: 221036 Difficulty: Medium
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
 */
package algorithms.num103_BinaryTreeZigzagLevelOrderTraversal;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	lsls = new ArrayList<List<Integer>>();
        if (root != null) {
            List<TreeNode> lastLevelTNLs = new ArrayList<TreeNode>();
            lastLevelTNLs.add(root);
            List<Integer> intLs = new ArrayList<Integer>();
            intLs.add(root.val);
            lsls.add(intLs);
            traverse(lastLevelTNLs, 1);
        }
        return lsls;
    }
    
    private static void traverse(List<TreeNode> lastLevelTNLs, int level) {
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
    		if (level % 2 != 0) Collections.reverse(thisLevelIntLs);
    		lsls.add(thisLevelIntLs);
    		traverse(thisLevelTNLs, level + 1);
    	}
    	
    }
}
//20160707Thu13:29 duration:3m25s78 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao