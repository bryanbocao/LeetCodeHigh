/**
https://leetcode.com/problems/path-sum-ii/
113. Path Sum II  QuestionEditorial Solution  My Submissions
Total Accepted: 86623
Total Submissions: 299034
Difficulty: Medium
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]

 */
package algorithms.num113_PathSumII;

import java.util.ArrayList;
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
	/**
	 * Definition for a binary tree node. public class TreeNode { int val;
	 * TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	static List<List<Integer>> lsls = null;
	static int mySum;

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		mySum = sum;
		lsls = new ArrayList<List<Integer>>();
		if (root != null) {
			List<Integer> ls = new ArrayList<Integer>();
			addPathsVal(root, ls);
		}
		return lsls;
	}

	private static void addPathsVal(TreeNode root, List<Integer> ls) {
		if (root != null) {
			ls.add(root.val);
			if (root.left == null && root.right == null) {
				Iterator<Integer> it = ls.iterator();
				int tsum = 0;
				while (it.hasNext()) tsum += it.next();
				if (tsum == mySum) lsls.add(ls);
			} else if (root.left != null && root.right != null){
			    List<Integer> lsRight = new ArrayList<Integer>();
			    lsRight.addAll(ls);
				addPathsVal(root.left, ls);
				addPathsVal(root.right, lsRight);
			} else {
                if (root.left != null) addPathsVal(root.left, ls);
				if (root.right != null) addPathsVal(root.right, ls);
			}
	    }
	}
}
//20160707Wed13:03 duration:8m18s10 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
