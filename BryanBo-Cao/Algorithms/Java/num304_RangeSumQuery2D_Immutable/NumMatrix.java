package num304_RangeSumQuery2D_Immutable;

public class NumMatrix {
	
	int[][] sumMatrix;
	
    public NumMatrix(int[][] matrix) {
    	int row = 0, col = 0;
    	if (matrix.length != 0) {
    		row = matrix.length;
    		col = matrix[0].length;
    	}
    	sumMatrix = new int[row + 1][col + 1];
    	for (int i = 1; i <= row; i++) {
    		for (int j = 1; j <= col; j++) {
    			sumMatrix[i][j] = sumMatrix[i - 1][j] + sumMatrix[i][j - 1] + matrix[i - 1][j - 1] - sumMatrix[i - 1][j - 1];
    		}
    	}
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumMatrix[row2 + 1][col2 + 1] - sumMatrix[row2 + 1][col1] - sumMatrix[row1][col2 + 1] + sumMatrix[row1][col1];
    }
}

// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);
/*
https://leetcode.com/problems/range-sum-query-2d-immutable/
304. Range Sum Query 2D - Immutable   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 24127
Total Submissions: 106421
Difficulty: Medium
Contributors: Admin
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
Hide Tags Dynamic Programming
Hide Similar Problems (E) Range Sum Query - Immutable (H) Range Sum Query 2D - Mutable

 */
//Result: SolvedOn20161125FriAt14:03 CodingDuration:14m06s61 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
//Inspired by https://www.youtube.com/watch?v=PwDqpOMwg6U