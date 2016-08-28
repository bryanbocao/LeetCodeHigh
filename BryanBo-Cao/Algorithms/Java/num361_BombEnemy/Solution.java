package algorithms.num361_BombEnemy;

public class Solution {
    public int maxKilledEnemies(char[][] grid) {
    	int maxKills = 0;
        for (int i = 0; i < grid.length; i++) {
        	for (int j = 0; j < grid[i].length; j++) {
        		if (grid[i][j] == '0') {
        			int kills = bomb(grid, i, j);
        			if (kills > maxKills) maxKills = kills;
        		}
        	}
        }
        return maxKills;
    }
    
    private int bomb(char[][] grid, int i, int j) {
    	int kills = 0;
    	for (int ii = i + 1; ii < grid.length && grid[ii][j] != 'W'; ii++) if (grid[ii][j] == 'E') kills++;
    	for (int ii = i - 1; ii >= 0 && grid[ii][j] != 'W'; ii--) if (grid[ii][j] == 'E') kills++;
    	for (int jj = j + 1; jj < grid[i].length && grid[i][jj] != 'W'; jj++) if (grid[i][jj] == 'E') kills++;
    	for (int jj = j - 1; jj >= 0 && grid[i][jj] != 'W'; jj--) if (grid[i][jj] == 'E') kills++;
    	return kills;
    }
}
//SolvedOn20160828SunAt14:14 CodingDuration:9m47s26 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
