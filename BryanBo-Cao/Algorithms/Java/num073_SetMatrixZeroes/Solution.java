/**
https://leetcode.com/problems/set-matrix-zeroes/
73. Set Matrix Zeroes  QuestionEditorial Solution  My Submissions
Total Accepted: 71782 Total Submissions: 210765 Difficulty: Medium
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

click to show follow up.

Follow up:
Did you use extra space?
A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
 */
package algorithms.num073_SetMatrixZeroes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rset = new HashSet<Integer>(),
        		cset = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
        	for (int j = 0; j < matrix[0].length; j++) {
        		if (matrix[i][j] == 0) {
        			rset.add(i);
        			cset.add(j);
        		}
        	}
        }
        Iterator<Integer> rit = rset.iterator();
        while (rit.hasNext()) {
        	int row = rit.next();
        	for (int j = 0; j < matrix[0].length; j++) matrix[row][j] = 0;
        }
        Iterator<Integer> cit = cset.iterator();
        while (cit.hasNext()) {
        	int col = cit.next();
        	for (int i = 0; i < matrix.length; i++) matrix[i][col] = 0;
        }
    }
}
//20160719Tue15:22 duration:around9m Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao