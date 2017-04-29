package num361_BombEnemy;

public class Solution_FromOther {
    public int maxKilledEnemies(char[][] grid) {
        if(grid == null || grid.length == 0 ||  grid[0].length == 0) return 0;
        int max = 0;
        int row = 0;
        int[] col = new int[grid[0].length];
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length;j++){
                if(grid[i][j] == 'W') continue;
                if(j == 0 || grid[i][j-1] == 'W'){
                     row = killedEnemiesRow(grid, i, j);
                }
                if(i == 0 || grid[i-1][j] == 'W'){
                     col[j] = killedEnemiesCol(grid,i,j);
                }
                if(grid[i][j] == '0'){
                    max = (row + col[j] > max) ? row + col[j] : max;
                }
            }
    
        }
        
        return max;
    }
    
    //calculate killed enemies for row i from column j
    private int killedEnemiesRow(char[][] grid, int i, int j){
        int num = 0;
        while(j <= grid[0].length-1 && grid[i][j] != 'W'){
            if(grid[i][j] == 'E') num++;
            j++;
        }
        return num;
    }
    //calculate killed enemies for  column j from row i
    private int killedEnemiesCol(char[][] grid, int i, int j){
        int num = 0;
        while(i <= grid.length -1 && grid[i][j] != 'W'){
            if(grid[i][j] == 'E') num++;
            i++;
        }
        return num;
    }
}
/*
https://leetcode.com/problems/bomb-enemy
361. Bomb Enemy Add to List
DescriptionHintsSubmissionsSolutions
Total Accepted: 13741
Total Submissions: 35560
Difficulty: Medium
Contributor: LeetCode
Given a 2D grid, each cell is either a wall 'W', an enemy 'E' or empty '0' (the number zero), return the maximum enemies you can kill using one bomb.
The bomb kills all the enemies in the same row and column from the planted point until it hits the wall since the wall is too strong to be destroyed.
Note that you can only put the bomb at an empty cell.

Example:
For the given grid

0 E 0 0
E 0 W E
0 E 0 0

return 3. (Placing a bomb at (1,1) kills 3 enemies)
Credits:
Special thanks to @memoryless for adding this problem and creating all test cases.
*/
/*
From https://discuss.leetcode.com/topic/48742/simple-dp-solution-in-java
Author https://discuss.leetcode.com/user/yun-hu
*/