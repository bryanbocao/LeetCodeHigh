package leetCodeWeeklyContest21.problem1;

public class Solution3_Trial {
    public int getMinimumDifference(TreeNode root) {
        int minDiff = -1; //-1 means minDiff not assigned yet
        minDiff = helper(root, minDiff);
        return minDiff;
    }
    private int helper(TreeNode root, int minDiff) {
        int leftMinDiff = -1, rightMinDiff = -1;
        if (root != null) {
            if (root.left == null && root.right == null) return minDiff;
            if (root.left != null) {
                int absDiff = Math.abs(root.val - root.left.val);
                if (minDiff == -1 || absDiff < minDiff) leftMinDiff = absDiff;
                System.out.println(leftMinDiff);
                leftMinDiff = helper(root.left, leftMinDiff);
            }
            if (root.right != null) {
                int absDiff = Math.abs(root.val - root.right.val);
                if (rightMinDiff == -1 || absDiff < minDiff) rightMinDiff = absDiff;
                System.out.println(rightMinDiff);
                rightMinDiff = helper(root.right, rightMinDiff);
            }
            return (leftMinDiff < rightMinDiff) ? leftMinDiff : rightMinDiff;
        }
        return -1;
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