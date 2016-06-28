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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Solution20160627Mon1430 {
    public int kthSmallest(TreeNode root, int k) {
    	if (root == null) return 0;
    	Stack<TreeNode> stk = new Stack<TreeNode>();
    	TreeNode tn = root;
    	stk.push(tn);
    	do {
    		if (tn.left == null) {
    			tn = stk.pop();
    			k--;
    		} else {
    			tn = tn.left;
    			stk.push(tn);
    		}
    		if (tn.right == null) {
    			tn = stk.pop();
    			k--;
    		} else {
    			tn = tn.right;
    			stk.push(tn);
    		}
    	} while (k > 1);
    	return tn.val;
    }
}
//20160627Mon14:30 duration:33s90 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
