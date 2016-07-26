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

public class Solution20160717Sun1318 {
    public int[][] generateMatrix(int n) {
        int[][] mtx = new int[0][0];
        if (n == 0) return mtx;
        else if (n == 1) {
        	mtx = new int[1][1];
        	mtx[0][0] = 1;
        	return mtx;
        } else {
        	mtx = new int[n][n];
        	int i = 0, j = -1, index = 1;
        	int dir = 0;//0->right, 1->down, 2->left, 3->up
        	while (index < n * n) {
        		System.out.println();
        		if (dir == 0) {
        			System.out.println("dir 0");
        			System.out.println("i: " + i + " j: " + j);
        			System.out.println("index: " + index);
        			if (j < n - 1 && mtx[i][j + 1] == 0) j++;
        			else {
        				dir = 1;
        				continue;
        			}
        		} else if (dir == 1) {
        			System.out.println("dir 1");
        			System.out.println("i: " + i + " j: " + j);
        			System.out.println("index: " + index);
        			if (i < n - 1 && mtx[i + 1][j] == 0) i++;
        			else {
        				dir = 2;
        				continue;
        			}
        			break;
        		} else if (dir == 2) {
        			System.out.println("dir 2");
        			System.out.println("i: " + i + " j: " + j);
        			System.out.println("index: " + index);
        			if (j > 0 && mtx[i][j - 1] == 0) j--;
        			else {
        				dir =3;
        				continue;
        			}
        		} else if (dir == 3) {
        			System.out.println("dir 3");
        			System.out.println("i: " + i + " j: " + j);
        			System.out.println("index: " + index);
        			if (i > 0 && mtx[i - 1][j] == 0) i--;
        			else {
        				dir = 0;
        				continue;
        			}
        		}
        		mtx[i][j] = index++;
        		System.out.println(mtx[i][j]);
        		System.out.println("i: " + i + " j: " + j);
        		System.out.println("end index: " + index);
        	}
        }
        return mtx;
    }
}
//20160717Sun13:18 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao