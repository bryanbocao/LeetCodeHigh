package leetCodeWeeklyContest21.problem1;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int x) { val = x; }
 * }
 */
public class Solution_FromOther {
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        
        getMinimumDifference(root.left);
        
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
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
//From https://discuss.leetcode.com/topic/80823/two-solutions-in-order-traverse-and-a-more-general-way-using-treeset
//Author https://discuss.leetcode.com/user/shawngao