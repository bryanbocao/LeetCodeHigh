package leetCodeWeeklyContest30.problem1.num566_ReshapeTheMatrix;

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	if (nums == null || nums.length == 0 || nums[0].length == 0) return nums;
        int row = nums.length, col = nums[0].length;
        if (row * col != r * c) return nums;
        int[][] nNums = new int[r][c];
        int irow = 0, jcol = 0;
        for (int ir = 0; ir < r; ir++) {
        	for (int jc = 0; jc < c; jc++) {
        		nNums[ir][jc] = nums[irow][jcol];
        		jcol++;
        		if (jcol >= col) {
        			jcol = 0;
        			irow++;
        		}
        	}
        }
        return nNums;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-30/problems/reshape-the-matrix/
566. Reshape the Matrix My SubmissionsBack To Contest
User Accepted: 962
User Tried: 992
Total Accepted: 1059
Total Submissions: 1528
Difficulty: Easy
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
Example 2:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]
Explanation:
There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
Note:
The height and width of the given matrix is in range [1, 100].
The given r and c are all positive.
 */
//SolvedOn20170429Night CodingDuration:8m31s40