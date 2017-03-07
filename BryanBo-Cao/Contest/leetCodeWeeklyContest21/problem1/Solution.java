package leetCodeWeeklyContest21.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	
	List<Integer> ls = new ArrayList<Integer>();
    public int getMinimumDifference(TreeNode root) {
        int minDiff = -1; //-1 means minDiff not assigned yet
        addTree(root);
        Collections.sort(ls);
        for (int i = 1; i < ls.size(); i++) {
        	int diff = ls.get(i) - ls.get(i - 1);
        	if (minDiff == -1 || diff < minDiff) minDiff = diff;
        }
        return minDiff;
    }
    
    private void addTree(TreeNode root) {
    	if (root != null) {
    		ls.add(root.val);
    		if (root.left != null) addTree(root.left);
    		if (root.right != null) addTree(root.right);
    	}
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-21/problems/minimum-absolute-difference-in-bst
/*
530. Minimum Absolute Difference in BST My SubmissionsBack To Contest
User Accepted: 1081
User Tried: 1220
Total Accepted: 1107
Total Submissions: 2328
Difficulty: Easy
Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
Note: There are at least two nodes in this BST.
 */
//SolvedOn20170225SatNight Duration:24m00s78