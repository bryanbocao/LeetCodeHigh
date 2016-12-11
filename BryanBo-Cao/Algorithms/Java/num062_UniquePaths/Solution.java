package num062_UniquePaths;

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (i == 0 || j == 0) grid[i][j] = 1;
        		else grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
        	}
        }
        return grid[m - 1][n - 1];
    }
}
//https://leetcode.com/problems/unique-paths/
/*
62. Unique Paths   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 115312
Total Submissions: 296331
Difficulty: Medium
Contributors: Admin
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?


Above is a 3 x 7 grid. How many possible unique paths are there?

Note: m and n will be at most 100.

Hide Company Tags Bloomberg
Hide Tags Array Dynamic Programming
Hide Similar Problems (M) Unique Paths II (M) Minimum Path Sum (H) Dungeon Game

 */
//SolvedOn20161211SunAt1:31 CodingDuration:19m33s40 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao