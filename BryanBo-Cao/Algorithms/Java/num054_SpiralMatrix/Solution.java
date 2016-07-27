/**
https://leetcode.com/problems/spiral-matrix/
54. Spiral Matrix  QuestionEditorial Solution  My Submissions
Total Accepted: 66238 Total Submissions: 284744 Difficulty: Medium
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].


 */
package algorithms.num054_SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> ls = new ArrayList<Integer>();
        if (matrix.length > 0) {
        	int r = matrix.length, c = matrix[0].length, n = r * c;
        	boolean[] passedR = new boolean[r], passedC = new boolean[c];
        	int i = 0, j = -1;
        	while (n > 0) {
        		
        		j++;
        		while (j < c && n >= 0 && !passedR[i] && !passedC[j]) {
        			System.out.println("line 17");
        			ls.add(matrix[i][j]);
        			n--;
        			j++;
        		}
        		j--;
        		passedR[i] = true;
        		
        		i++;
        		while (i < r && n >= 0 && !passedR[i] && !passedC[j]) {
        			System.out.println("line 27");
        			ls.add(matrix[i][j]);
        			n--;
        			i++;
        		}
        		i--;
        		passedC[j] = true;
        		
        		j--;
        		while (j >= 0 && n >= 0 && !passedR[i] && !passedC[j]) {
        			System.out.println("line 37");
        			ls.add(matrix[i][j]);
        			n--;
        			j--;
        		}
        		j++;
        		passedR[i] = true;
        		
        		i--;
        		while (i >= 0 && n >= 0 && !passedR[i] && !passedC[j]) {
        			System.out.println("line 47");
        			ls.add(matrix[i][j]);
        			n--;
        			i--;
        		}
        		i++;
        		passedC[j] = true;
        	}
        }
        return ls;
    }
}
//20160726Tue22:24 duration:28m23s79 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 