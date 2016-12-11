package num063_UniquePathsII;

public class Solution2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int rows = obstacleGrid.length, cols = obstacleGrid[0].length;
    	int[][] dpGrid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < cols; j++) {
        		if (obstacleGrid[i][j] == 0) {
        			if (i == 0 && j == 0) dpGrid[i][j] = 1;
        			else if (i == 0 && j > 0 && obstacleGrid[i][j - 1] == 1) dpGrid[i][j] = 0;
        			else if (j == 0 && i > 0 && obstacleGrid[i - 1][j] == 1) dpGrid[i][j] = 0;
        			else if (i > 0 && j > 0 && obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] == 1) dpGrid[i][j] = 0;
        			else if (i > 0 && j > 0) dpGrid[i][j] = dpGrid[i - 1][j] + dpGrid[i][j - 1];
        		} else dpGrid[i][j] = 0;
        		if (dpGrid[0][0] == 0) return 0;
        	}
        }
        return dpGrid[rows - 1][cols - 1];
    }
}
/*
Input:
[[1,0]]
Output:
1
Expected:
0

More Details 

Input:
[[0,0],[1,1],[0,0]]
Output:
1
Expected:
0

Input:
[[0,0]]
Output:
0
Expected:
1

Input:
[[0,1,0,0,0],[1,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]
Output:
5
Expected:
0
*/