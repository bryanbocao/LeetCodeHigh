package num063_UniquePathsII;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int rows = obstacleGrid.length, cols = obstacleGrid[0].length;
    	int[][] grid = obstacleGrid;
    	grid[0][0] ^= 1;
    	for (int i = 1; i < rows; i++) grid[i][0] = (grid[i][0] == 1) ? 0 : grid[i - 1][0];
    	for (int j = 1; j < cols; j++) grid[0][j] = (grid[0][j] == 1) ? 0 : grid[0][j - 1];
    	for (int i = 1; i < rows; i++) for (int j = 1; j < cols; j++) grid[i][j] = (grid[i][j] == 1) ? 0 : grid[i][j - 1] + grid[i - 1][j];
    	return grid[rows - 1][cols - 1];
    }
}
//https://leetcode.com/problems/unique-paths-ii/
/*
63. Unique Paths II   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 86236
Total Submissions: 280292
Difficulty: Medium
Contributors: Admin
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.

Note: m and n will be at most 100.

Hide Company Tags Bloomberg
Hide Tags Array Dynamic Programming
Hide Similar Problems (M) Unique Paths

 */
//SolvedOn20161211SunAt2:47 CodingDuration:1h04m27s10 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao