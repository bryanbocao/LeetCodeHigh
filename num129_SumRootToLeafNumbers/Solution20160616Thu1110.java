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
import java.util.List;

import javax.swing.tree.TreeNode;

public class Solution20160616Thu1110 {
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
	    public int sumNumbers(TreeNode root) {
	        if (root == null) return 0;
	        else {
	        	List<Integer> ls = new ArrayList<Integer>();
	        	ls.addAll(addPathsVal(root));
	        	Iterator<Integer> it = ls.iterator();
	        	int sum = 0;
	        	int leafSum = 0;
	        	while (it.hasNext()) {
	        		int next = it.next();
	        		if (next == -1) sum += leafSum;
	        		else leafSum += next;
	        	}
	        }
	    }
	    private static List<Integer> addPathsVal(TreeNode root) {
	    	if (root == null) return null;
	    	else {
	    		List<Integer> lst = new ArrayList<Integer>();
	    		if (root.left == null && root.right == null) {
	    			lst.add(root.val);
	    			lst.add(-1);
	    			return lst;
	    		}
	    		if (root.left != null){
	    			
	    		}
	    	}
	    }
	}
}
//20160616Thu11:10 duration:26m27s80 NotFinished @github.com/BryanBo-Cao
