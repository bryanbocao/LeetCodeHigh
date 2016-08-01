/**
https://leetcode.com/problems/range-sum-query-2d-immutable/
304. Range Sum Query 2D - Immutable  QuestionEditorial Solution  My Submissions
Total Accepted: 16982 Total Submissions: 75406 Difficulty: Medium
Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

Range Sum Query 2D
The above rectangle (with the red border) is defined by (row1, col1) = (2, 1) and (row2, col2) = (4, 3), which contains sum = 8.

Example:
Given matrix = [
  [3, 0, 1, 4, 2],
  [5, 6, 3, 2, 1],
  [1, 2, 0, 1, 5],
  [4, 1, 0, 1, 7],
  [1, 0, 3, 0, 5]
]

sumRegion(2, 1, 4, 3) -> 8
sumRegion(1, 1, 2, 2) -> 11
sumRegion(1, 2, 2, 4) -> 12
Note:
You may assume that the matrix does not change.
There are many calls to sumRegion function.
You may assume that row1 ≤ row2 and col1 ≤ col2.
 */
package algorithms.num304_RangeSumQuery2D_Immutable;

public class NumMatrix20160801Mon1538 {
	int[][] matrix = null;
	int[] sumInR = null, sumInC = null;
    public NumMatrix20160801Mon1538(int[][] matrix) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return ;
    	this.matrix = matrix;
    	sumInR = new int[matrix.length];
    	sumInC = new int[matrix[0].length];
    	for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[0].length; j++) {
    			sumInR[i] += matrix[i][j];
    			sumInC[j] += matrix[i][j];
    		}
    	}
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0, rD = row2 - row1, cD = col2 - col1, r = matrix.length, c = matrix[0].length;
        if (rD >= r / 2) {
        	if (cD >= c / 2) {
        		if (rD > cD) {
            		for (int i = row1; i <= row2; i++) {
            			sum += sumInR[i];
            			for (int j = 0; j < col1; j++) sum -= matrix[i][j];
            			for (int j = col2 +1; j < c; j++) sum -= matrix[i][j];
            		}
        		} else {
        			for (int j = col1; j <= col2; j++) {
            			sum += sumInC[j];
            			for (int i = 0; i < row1; i++) sum -= matrix[i][j];
            			for (int i = row2 +1; i < r; i++) sum -= matrix[i][j];
            		}
        		}
        	} else {
        		for (int i = row1; i <= row2; i++) {
        			sum += sumInR[i];
        			for (int j = 0; j < col1; j++) sum -= matrix[i][j];
        			for (int j = col2 +1; j < c; j++) sum -= matrix[i][j];
        		}
        	}
        } else {
        	if (cD >= c / 2) {
    			for (int j = col1; j <= col2; j++) {
        			sum += sumInC[j];
        			for (int i = 0; i < row1; i++) sum -= matrix[i][j];
        			for (int i = row2 +1; i < r; i++) sum -= matrix[i][j];
        		}
        	} else {
        		for (int i = row1; i <= row2; i++) for (int j = col1; j <= col2; j++) sum += matrix[i][j];
        	}
        }
        
        return sum;
    }
}
//20160801Mon15:38 duration:54m47s00 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);
