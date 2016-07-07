/**
https://leetcode.com/problems/sum-root-to-leaf-numbers/
129. Sum Root to Leaf Numbers My Submissions QuestionEditorial Solution
Total Accepted: 79118 Total Submissions: 238896 Difficulty: Medium
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.
 */
package algorithms.num129_SumRootToLeafNumbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val;
	 * TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	static List<List<Integer>> lsls = new ArrayList<List<Integer>>();

	public int sumNumbers(TreeNode root) {
		int sum = 0;
		if (root != null) {
			List<Integer> ls = new ArrayList<Integer>();
			addPathsVal(root, ls);
			Iterator<List<Integer>> itit = lsls.iterator();
			
			while (itit.hasNext()) {
				List<Integer> nextls = itit.next();
				Iterator<Integer> it = nextls.iterator();
				int tsum = 0;
				while (it.hasNext()) {
					tsum *= 10;
					tsum += it.next();
					System.out.println(tsum);
				}
				sum += tsum;
			}
		}
		return sum;
	}

	private static void addPathsVal(TreeNode root, List<Integer> ls) {
		if (root != null) {
			ls.add(root.val);
			if (root.left == null && root.right == null) {
				lsls.add(ls);
			}
			else {
				if (root.left != null) addPathsVal(root.left, ls);
				if (root.right != null) addPathsVal(root.right, ls);
			}
	    }
	}
}
//20160706Tue18:22 duration:31m14s69 WrongAnswer(why?) @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao