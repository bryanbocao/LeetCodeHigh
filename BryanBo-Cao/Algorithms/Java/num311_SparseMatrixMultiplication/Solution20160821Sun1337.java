/**
https://leetcode.com/problems/sparse-matrix-multiplication/
Locked Question
 */
package algorithms.num311_SparseMatrixMultiplication;

public class Solution20160821Sun1337 {
    public int[][] multiply(int[][] A, int[][] B) {
    	int[][] M = null;
    	if (A != null && A[0].length > 0) {
    	    M = new int[A.length][B[0].length];
	    	for (int ai = 0; ai < A.length; ai++) {
	    		for (int bj = 0; bj < B[0].length; bj++) {
	    			int aj = 0;
	    			for (int bi = 0; bi < B.length; bi++) {
	    				M[ai][bj] += A[ai][aj] * B[bi][bj];
	    				aj++;
	    			}
	    		}
	    	}
    	}
    	return M;
    }
}
//TriedOn20160821Sun13:37 CodingDuration:12m36s82 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
