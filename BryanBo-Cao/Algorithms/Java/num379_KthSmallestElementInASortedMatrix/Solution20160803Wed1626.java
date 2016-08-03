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

public class Solution20160803Wed1626 {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix != null && matrix.length > 0 && matrix[0].length > 0) {
        	int iR = 0, jR = 0, iD = 0, jD = 0, r = matrix.length, c = matrix[0].length;
        	int i = 1;
        	while (iR < r && jR < c && iD < r && jD < c) {
        		boolean gotMin = false;
        		int min = -1, direction = 0;
        		int[] minIs = new int[2];
        		if (jR + 1 < c) {
        			min = matrix[iR][jR + 1];
        			minIs[0] = iR;
        			minIs[1] = jR + 1;
        			gotMin = true;
        		}
        		if (iR + 1 < c) {
        			if ((gotMin && matrix[iR + 1][jR] < min) || !gotMin) {
        				min = matrix[iR + 1][jR];
            			minIs[0] = iR + 1;
            			minIs[1] = jR;
            			gotMin = true;
            			direction = 1;
        			}
        		}
        		if (jD + 1 < c) {
        			if ((gotMin && matrix[iD][jD + 1] < min) || !gotMin) {
        				min = matrix[iD][jD + 1];
            			minIs[0] = iD;
            			minIs[1] = jD + 1;
            			gotMin = true;
            			direction = 2;
        			}
        		}
        		if (iD + 1 < c) {
        			if ((gotMin && matrix[iD + 1][jD] < min) || !gotMin) {
        				min = matrix[iD + 1][jD];
            			minIs[0] = iD + 1;
            			minIs[1] = jD;
            			gotMin = true;
            			direction = 3;
        			}
        		}
        		System.out.println("i: " + i + " matrix[minIs[0]][minIs[1]]: " + matrix[minIs[0]][minIs[1]] + " direction: " + direction);
        		if (i++ == k) return matrix[minIs[0]][minIs[1]];
        		switch (direction) {
        		case 0: jR++; break;
        		case 1: iR++; break;
        		case 2: jD++; break;
        		case 3: iD++; break;
        		}
        	}
        }
        return -1;
    }
    
}
//20160803Wed16:26 WrongAnser @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
