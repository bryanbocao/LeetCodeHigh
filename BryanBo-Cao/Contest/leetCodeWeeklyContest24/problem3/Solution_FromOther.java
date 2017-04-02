package leetCodeWeeklyContest24.problem3;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution_FromOther {

    int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    
    public void convert(TreeNode cur) {
        if (cur == null) return;
        convert(cur.right);
        sum += cur.val;
        cur.val += sum - cur.val;
        convert(cur.left);
    }
    
}
//https://leetcode.com/contest/leetcode-weekly-contest-24/problems/01-matrix/
/*
542. 01 Matrix My SubmissionsBack To Contest
User Accepted: 340
User Tried: 586
Total Accepted: 344
Total Submissions: 1438
Difficulty: Medium
Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.
Example 1: 
Input:

0 0 0
0 1 0
0 0 0
Output:
0 0 0
0 1 0
0 0 0
Example 2: 
Input:

0 0 0
0 1 0
1 1 1
Output:
0 0 0
0 1 0
1 2 1
Note:
The number of elements of the given matrix will not exceed 10,000.
There are at least one 0 in the given matrix.
The cells are adjacent in only four directions: up, down, left and right.
 */
//From https://discuss.leetcode.com/user/compton_scatter
//Author: https://discuss.leetcode.com/topic/83455/java-recursive/2
//PracticeOn20170318Sat 5Times