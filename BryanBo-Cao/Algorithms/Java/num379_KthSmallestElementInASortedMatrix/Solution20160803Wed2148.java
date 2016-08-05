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
package algorithms.num379_KthSmallestElementInASortedMatrix;

import java.util.HashMap;
import java.util.Map;

public class Solution20160803Wed2148 {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix != null && matrix.length > 0 && matrix[0].length > 0) {
        	int i = 0, j = 0, r = matrix.length, c = matrix[0].length;
        	int[] rowFirstJ = new int[r], colFirstI = new int[c];
        	if (c > 1) rowFirstJ[0] = 1;
        	if (r > 1) colFirstI[0] = 1;
        	int step = 1;
        	while (i + j < r + c - 1) {
        		System.out.println("step: " + step + " i: " + i + " j: " + j);
        		System.out.println("rowFirstJ[1]: " + rowFirstJ[1]);
        		if(step++ == k) return matrix[i][j];
        		int nextJ = (j + 1 < c) ? j + 1 : -1, nextI = (i + 1 < r) ? i + 1 : -1;
        		int nextJV = -1, nextIV = -1;
        		if (j + 1 < c) nextJV = matrix[colFirstI[j + 1]][j + 1];
        		if (i + 1 < r) nextIV = matrix[i + 1][rowFirstJ[i + 1]];
        		if (nextJ == -1 || (nextIV > -1 && nextIV < nextJV)) j = rowFirstJ[++i];
        		else if (nextI == -1 || (nextJV > -1 && nextJV <= nextIV)) i = colFirstI[++j];
        		if (j + 1 < c) rowFirstJ[i] = j + 1;
    			if (i + 1 < r) colFirstI[j] = i + 1;
        	}
        }
        return -1;
    }
    
}
//20160803Wed21:48 duration:6m35s73 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

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
*/