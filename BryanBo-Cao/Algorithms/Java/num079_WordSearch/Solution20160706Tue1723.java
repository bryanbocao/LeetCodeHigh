/**
https://leetcode.com/problems/word-search/
79. Word Search  QuestionEditorial Solution  My Submissions
Total Accepted: 80541 Total Submissions: 341887 Difficulty: Medium
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

For example,
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
 */
package algorithms.num079_WordSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution20160706Tue1723 {
	
	static boolean[][] moved = null;
    public boolean exist(char[][] board, String word) {
    	if (board == null) return false;
        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board[0].length; j++) {
        		if (board[i][j] == word.charAt(0)) {
        			moved = new boolean[board.length][board[0].length];
        			moved[i][j] = true;
        			if (isWord(board, i, j, word, 0)) return true;
        			System.out.println();
        		}
        	}
        }
        return false;
    }
    
    private static boolean isWord(char[][] board, int ir, int ic, String word, int ichar) {
    	System.out.println("ir: " + ir + " ic: " + ic);
    	if (ichar >= word.length()) return false;
    	else if (ichar == word.length() - 1) {
    		System.out.println("ichar: " + ichar);
    		System.out.println("word.charAt(ichar): " + word.charAt(ichar));
    		if (board[ir][ic] == word.charAt(ichar)) return true;
    		else return false;
    	} else {//ichar < word.length() - 1
    		if (ir - 1 >= 0 && moved[ir - 1][ic] == false && board[ir - 1][ic] == word.charAt(ichar + 1)) {
    			moved[ir - 1][ic] = true;
    			if (isWord(board, ir - 1, ic, word, ichar + 1)) return true;
//    			else return false;
    		}
    		if (ir + 1 < board.length && moved[ir + 1][ic] == false && board[ir + 1][ic] == word.charAt(ichar + 1)) {
    			moved[ir + 1][ic] = true;
    			if (isWord(board, ir + 1, ic, word, ichar + 1)) return true;
//    			else return false;
    		}
    		if (ic - 1 >= 0 && moved[ir][ic - 1] == false && board[ir][ic - 1] == word.charAt(ichar + 1)) {
    			moved[ir][ic - 1] = true;
    			if (isWord(board, ir, ic - 1, word, ichar + 1)) return true;
//    			else return false;
    		}
    		if (ic + 1 < board[0].length && moved[ir][ic + 1] == false && board[ir][ic + 1] == word.charAt(ichar + 1)) {
    			moved[ir][ic + 1] = true;
    			if (isWord(board, ir, ic + 1, word, ichar + 1)) return true;
//    			else return false;
    		}
    		return false;
    	}
    }
}
//20160706Tue1723 duration:46m51s88 WrongAnswer(can't deal with multi direction on one char) @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao