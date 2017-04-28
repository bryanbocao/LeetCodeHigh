package leetCode.num200_NumberOfIslands;

public class Solution_FromOther_BryanBCRevision {
    
	public int numIslands(char[][] grid) {
	    int cnt = 0;
	    if (grid.length == 0) return 0;
	    for (int i = 0; i < grid.length; i++){
	        for (int j = 0; j < grid[0].length; j++)
	            if (grid[i][j] == '1') {
	                DFSMarking(grid, i, j);
	                ++cnt;
	            }
	    }    
	    return cnt;
	}

	private void DFSMarking(char[][] grid, int i, int j) {
	    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') return;
	    grid[i][j] = '0';
	    DFSMarking(grid, i + 1, j);
	    DFSMarking(grid, i - 1, j);
	    DFSMarking(grid, i, j + 1);
	    DFSMarking(grid, i, j - 1);
	}
}
/*
https://leetcode.com/problems/number-of-islands
200. Number of Islands Add to List
DescriptionSubmissionsSolutions
Total Accepted: 96883
Total Submissions: 290103
Difficulty: Medium
Contributor: LeetCode
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3

Credits:
Special thanks to @mithmatt for adding this problem and creating all test cases.
*/
/*
From https://discuss.leetcode.com/topic/13248/very-concise-java-ac-solution
Author https://discuss.leetcode.com/user/wcyz666
*/
//PracticedOn20170407Fri 5Times
