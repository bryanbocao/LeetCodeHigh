/**
https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
378. Kth Smallest Element in a Sorted Matrix  QuestionEditorial Solution  My Submissions
Total Accepted: 2702 Total Submissions: 6800 Difficulty: Medium
Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example:

matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
],
k = 8,

return 13.
Note: 
You may assume k is always valid, 1 ≤ k ≤ n2.
 */
package algorithms.num378_KthSmallestElementInASortedMatrix;

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix != null && matrix.length > 0 && matrix[0].length > 0) {
        	int i = 0, j = 0, r = matrix.length, c = matrix[0].length;
        	int[] rowFirstJ = new int[r], colFirstI = new int[c];
        	if (c > 1) rowFirstJ[0] = 1;
        	if (r > 1) colFirstI[0] = 1;
        	int step = 1, startII = 0, startJJ = 0;
        	while (i + j < r + c - 1) {
        		if(step++ == k) return matrix[i][j];
        		int minI = -1, minJ = -1;
        		
        		boolean hitFirstRow = false;
        		for (int ii = startII; ii < r && rowFirstJ[ii] < r && !hitFirstRow; ii++) {
        			int jj = rowFirstJ[ii];
        			if (jj == 0) hitFirstRow = true;
        			if ((minI == -1 && minJ == -1) || (matrix[ii][jj] < matrix[minI][minJ])) {
        				minI = ii; minJ = jj;
        			}
        		}
        		
        		boolean hitFirstCol = false;
        		for (int jj = startJJ; jj < c && colFirstI[jj] < c && !hitFirstCol; jj++) {
        			int ii = colFirstI[jj];
        			if (ii == 0) hitFirstCol = true;
        			if ((minI == -1 && minJ == -1) || (matrix[ii][jj] < matrix[minI][minJ])) {
        				minI = ii; minJ = jj;
        			}
        		}
        		
        		i = minI; j = minJ;
        		rowFirstJ[i] = j + 1; colFirstI[j] = i + 1;
        		if (rowFirstJ[i] == c && i + 1 < r) startII = i + 1;
        		if (colFirstI[j] == r && j + 1 < c) startJJ = j + 1;
        	}
        }
        return -1;
    }
    
}
//20160803Wed20:17 duration:49m44s00 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

/**
Input:
[[1,3,5],
 [6,7,12],
 [11,14,14]
]
7
Output:
14
Expected:
12
=========================
[[1,5,9],[10,11,13],[12,13,15]]
8
Your stdout

step: 1 i: 0 j: 0
rowFirstJ[1]: 0
step: 2 i: 0 j: 1
rowFirstJ[1]: 0
step: 3 i: 0 j: 2
rowFirstJ[1]: 0
step: 4 i: 1 j: 1
rowFirstJ[1]: 2
step: 5 i: 2 j: 1
rowFirstJ[1]: 2
step: 6 i: 2 j: 2
rowFirstJ[1]: 2
Your answer

Line 34: java.lang.ArrayIndexOutOfBoundsException: -1
Expected answer

13

*/