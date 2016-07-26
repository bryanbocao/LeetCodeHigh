/**
https://leetcode.com/problems/kth-smallest-element-in-a-bst/
230. Kth Smallest Element in a BST My Submissions QuestionEditorial Solution
Total Accepted: 52520 Total Submissions: 135522 Difficulty: Medium
Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?

Hint:

Try to utilize the property of a BST.
What if you could modify the BST node's structure?
The optimal runtime complexity is O(height of BST).
 */
package algorithms.num230_KthSmallestElementInABST;

import java.util.Stack;

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
    public int kthSmallest(TreeNode root, int k) {
    	if (root == null) return 0;
    	Stack<TreeNode> stk = new Stack<TreeNode>();
    	TreeNode tn = root, rttn = null;
    	stk.push(tn);
    	do {
    		if (tn.left == null) {
        		if (tn.right == null) {
            		if (k-- == 1) return tn.val;
            		stk.pop();
            		if (rttn != null) {
            			stk.push(rttn);
            			rttn = null;
            		}
            		if (stk.isEmpty()) tn = tn.right;
            		else tn = stk.peek();
        		} else {
        			rttn = tn.right;
        			tn.right = null;
        		}
    		} else {
    			TreeNode tnl = tn.left;
    			tn.left = null;
    			stk.push(tnl);
    			tn = tnl;
    		}
    	} while (k >= 1);
    	return tn.val;
    }
}
//20160627Mon18:19 duration:3h15m47s78 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao