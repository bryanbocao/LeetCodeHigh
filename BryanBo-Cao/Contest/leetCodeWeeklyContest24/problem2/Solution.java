package leetCodeWeeklyContest24.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
    public TreeNode convertBST(TreeNode root) {
    	if (root == null || (root.left == null && root.right == null)) return root;
        List<Integer> ls = new ArrayList<Integer>();
        traverse(root, ls);
        Collections.sort(ls);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Iterator<Integer> it = ls.iterator();
        while (it.hasNext()) System.out.println(it.next());
        int size = ls.size();
        for (int i = size - 1; i >= 0; i--) {
        	int val = ls.get(i);
        	if (i == size - 1) map.put(val, val);
        	else {
        		int preVal = ls.get(i + 1), preSum = map.get(preVal);
        		if (val < preVal) map.put(val, preSum + val);
        		else map.put(val, preSum);
        	}
        }
        assignVal(root, map);
        return root;
    }
    
    private void traverse(TreeNode root, List<Integer> ls) {
    	if (root != null) {
    		ls.add(root.val);
    		if (root.left != null) traverse(root.left, ls);
    		if (root.right != null) traverse(root.right, ls);
    	}
    }
    
    private void assignVal(TreeNode root, Map<Integer, Integer> map) {
    	if (root != null) {
    		root.val = map.get(root.val);
    		if (root.left != null) assignVal(root.left, map);
    		if (root.right != null) assignVal(root.right, map);
    	}
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-24/problems/convert-bst-to-greater-tree/
/*
538. Convert BST to Greater Tree My SubmissionsBack To Contest
User Accepted: 759
User Tried: 882
Total Accepted: 776
Total Submissions: 1597
Difficulty: Easy
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
 */
//SolvedOn20170318SatNight CodingDuration:25m