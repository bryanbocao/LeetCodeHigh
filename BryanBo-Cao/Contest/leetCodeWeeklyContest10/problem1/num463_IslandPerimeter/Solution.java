package leetCodeWeeklyContest10.problem1.num463_IslandPerimeter;

public class Solution {
    public int islandPerimeter(int[][] grid) {
    	int prmt = 0;
        for (int i = 0; i < grid.length; i++) {
        	for (int j = 0; j < grid[0].length; j++) {
        		switch (grid[i][j]) {
            		case 0:
            			if (i - 1 >= 0 && grid[i - 1][j] == 1) prmt++;
            			if (i + 1 < grid.length && grid[i + 1][j] == 1) prmt++;
            			if (j - 1 >= 0 && grid[i][j - 1] == 1) prmt++;
            			if (j + 1 < grid[0].length && grid[i][j + 1] == 1) prmt++;
            			break;
            		case 1:
            			if (i == 0 || i == grid.length - 1) prmt++;
            			if (j == 0 || j == grid[0].length - 1) prmt++;
            			break;
        		}
        	}
        }
        return prmt;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-10/problems/island-perimeter/
463. Island Perimeter My SubmissionsBack To Contest
User Accepted: 513
User Tried: 753
Total Accepted: 541
Total Submissions: 874
Difficulty: Easy
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
Explanation: The perimeter is the 16 yellow stripes in the image below:

 */
//Result: TriedOn20161119SatNight CodingDuration:23m32s19 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao