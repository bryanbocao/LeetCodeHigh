/**
https://leetcode.com/problems/spiral-matrix-ii/
59. Spiral Matrix II  QuestionEditorial Solution  My Submissions
Total Accepted: 57609 Total Submissions: 160209 Difficulty: Medium
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */
package algorithms.num059_SpiralMatrixII;

public class Solution20160717Sun1359 {
    public int[][] generateMatrix(int n) {
        int[][] mtx = new int[0][0];
        if (n == 0) return mtx;
        else if (n == 1) {
        	mtx = new int[1][1];
        	mtx[0][0] = 1;
        	return mtx;
        } else {
        	mtx = new int[n][n];
        	int i = 0, j = -1, index = 1, n2 = n * n;
        	while (index <= n2) {
        		while (index <= n2 && j < n - 1 && mtx[i][j + 1] == 0) {
        			System.out.println();
        			System.out.println("while (j < n - 1 && mtx[i][j + 1] == 0)");
        			j++;
        			mtx[i][j] = index++;
        			System.out.println(mtx[i][j]);
            		System.out.println("i: " + i + " j: " + j);
        		}
        		while (index <= n2 && i < n - 1 && mtx[i + 1][j] == 0) {
        			System.out.println();
        			System.out.println("while (i < n - 1 && mtx[i + 1][j] == 0) {");
        			i++;
        			mtx[i][j] = index++;
        			System.out.println(mtx[i][j]);
            		System.out.println("i: " + i + " j: " + j);
        		}
        		while (index <= n2 && j > 0 && mtx[i][j - 1] == 0) {
        			System.out.println();
        			System.out.println("while (j > 0 && mtx[i][j - 1] == 0) {");
        			j--;
        			mtx[i][j] = index++;
        			System.out.println(mtx[i][j]);
            		System.out.println("i: " + i + " j: " + j);
            		
        		}
        		while (index <= n2 && i > 0 && mtx[i - 1][j] == 0) {
        			System.out.println();
        			System.out.println("while (i > 0 && mtx[i - 1][j] == 0) {");
        			i--;
        			mtx[i][j] = index++;
        			System.out.println(mtx[i][j]);
            		System.out.println("i: " + i + " j: " + j);
        		}
        		
        		System.out.println("end index: " + index);
        		System.out.println("end i: " + i + " j: " + j);
        	}
        }
        return mtx;
    }
}
//20160717Sun13:59 duration:1h27m10s70 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao