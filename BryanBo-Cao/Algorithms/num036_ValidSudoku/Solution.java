/**
https://leetcode.com/problems/valid-sudoku/
36. Valid Sudoku  QuestionEditorial Solution  My Submissions
Total Accepted: 82431 Total Submissions: 259531 Difficulty: Easy
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules(http://sudoku.com.au/TheRules.aspx).

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 */
package algorithms.num036_ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
      
    	for (int i = 0; i < 9; i++) {
        	Set<Character> set = new HashSet<Character>();
        	for (int j = 0; j < 9; j++) {
        		if (board[i][j] != '.') {
        			if (set.contains(board[i][j])) return false;
        			else set.add(board[i][j]);
        		}
        	}
        }
    	
        for (int j = 0; j < 9; j++) {
        	Set<Character> set = new HashSet<Character>();
        	for (int i = 0; i < 9; i++) {
        		if (board[i][j] != '.') {
        			if (set.contains(board[i][j])) return false;
        			else set.add(board[i][j]);
        		}
        	}
        }
        
        for (int ii = 0; ii < 9; ii += 3) {
        	for (int jj = 0; jj < 9; jj += 3) {
        		
        		//single 9 square
        		Set<Character> set = new HashSet<Character>();
            	for (int i = ii; i < ii + 3; i++) {
                	for (int j = jj; j < jj + 3; j++) {
                		if (board[i][j] != '.') {
                			if (set.contains(board[i][j])) return false;
                			else set.add(board[i][j]);
                		}
                	}
                }
            	
        	}
        }
        
        return true;
    }
}
//20160723Sat23:28 duration:25m21s12 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
/**
Input:
["........2","......6..","..14..8..",".........",".........","....3....","5.86.....",".9....4..","....5...."]

... ... ..2
... ... 6..
..1 4.. 8..

... ... ...
... ... ...
... .3. ...

5.8 6.. ...
.9. ... 4..
... .5. ...

Output:
false
Expected:
true

========

Input:
["....5..1.",".4.3.....",".....3..1","8......2.","..2.7....",".15......",".....2...",".2.9.....","..4......"]

... .5. .1.
.4. 3.. ...
... ..3 ..1

8.. ... .2.
..2 .7. ...
.15 ... ...

... ..2 ...
.2. 9.. ...
..4 ... ...

Output:
true
Expected:
false
*/