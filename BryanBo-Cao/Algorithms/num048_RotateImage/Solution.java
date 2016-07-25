/**
https://leetcode.com/problems/rotate-image/
48. Rotate Image  QuestionEditorial Solution  My Submissions
Total Accepted: 74482
Total Submissions: 209841
Difficulty: Medium
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
 */
package algorithms.num048_RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length > 0) {
        	int n = matrix.length;
        	for (int i = 0; i < (n + 1) / 2; i++) {
        		for (int j = i; j < n - 1 - i; j++) {
        			int t = matrix[i][j];
        			matrix[i][j] = matrix[n - 1 - j][i];
        			matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
        			matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
        			matrix[j][n - 1 - i] = t;
        		}
        	}
        }
    }
}
//20160724Sun18:22 duration:37m58s30 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 