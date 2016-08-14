/**
https://leetcode.com/problems/design-tic-tac-toe/
Locked Question
 */
package algorithms.num348_DesignTicTacToe;

public class TicTacToe {

    /** Initialize your data structure here. */
	// BryanBo-Cao's Code ====== start
	char[][] arr = null;
	int[] cntInRow = null, cntInCol = null;
	int diagonal, antiDiagonal;
	// BryanBo-Cao's Code ====== end
    public TicTacToe(int n) {
        // BryanBo-Cao's Code ====== start
    	arr = new char[n][n];
    	cntInRow = new int[n];
    	cntInCol = new int[n];
    	diagonal = 0;
    	antiDiagonal = 0;
    	// BryanBo-Cao's Code ====== end
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        // BryanBo-Cao's Code ====== start
    	int n = cntInRow.length;
    	if (arr[row][col] != 'X' && arr[row][col] != 'O') {
    		if (player == 1) arr[row][col] = 'X';
        	else if (player == 2) arr[row][col] = 'O';
    		cntInRow[row]++;
    		cntInCol[col]++;
    		if (row == col) diagonal++;
    		if (row == n - 1 - col) antiDiagonal++;
    		if (cntInRow[row] == n) {
    			char playerC = arr[row][0];
    			int i = 1;
    			while (i < n && arr[row][i] == playerC) i++;
    			if (i == n) {
    				if (playerC == 'X') return 1;
    				else if (playerC == 'O') return 2;
    			}
    			cntInRow[row]++;
    		}
    		if (cntInCol[col] == n) {
    			char playerC = arr[0][col];
    			int i = 1;
    			while (i < n && arr[i][col] == playerC) i++;
    			if (i == n) {
    				if (playerC == 'X') return 1;
    				else if (playerC == 'O') return 2;
    			}
    			cntInCol[col]++;
    		}
    		if (diagonal == n) {
    			char playerC = arr[0][0];
    			int i = 1;
    			while (i < n && arr[i][i] == playerC) i++;
    			if (i == n) {
    				if (playerC == 'X') return 1;
    				else if (playerC == 'O') return 2;
    			}
    			diagonal++;
    		}
    		if (antiDiagonal == n) {
    			char playerC = arr[0][n - 1];
    			int i = 1;
    			while (i < n && arr[i][n - 1 - i] == playerC) i++;
    			if (i == n) {
    				if (playerC == 'X') return 1;
    				else if (playerC == 'O') return 2;
    			}
    			antiDiagonal++;
    		}
    	}
    	return 0;
    	// BryanBo-Cao's Code ====== end
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
//20160814Sun19:42 CodingDuration:50m06s75 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

/**
Input:
["TicTacToe","move","move","move"]
[[2],[0,0,2],[1,1,1],[0,1,2]]
Output:
["constructor","0","0","0"]
Expected:
["constructor","0","0","2"]

Input:
["TicTacToe","move","move","move"]
[[2],[0,1,1],[1,1,2],[1,0,1]]
Output:
["constructor","0","0","0"]
Expected:
["constructor","0","0","1"]
*/