package leetCodeWeeklyContest24.problem3;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public List<List<Integer>> updateMatrix(List<List<Integer>> matrix) {
        int row = matrix.size(), col = matrix.get(0).size();
        List<List<Integer>> nM = new ArrayList<List<Integer>>();
        for (int i = 0; i < row; i++) {
        	List<Integer> nR = new ArrayList<Integer>();
        	for (int j = 0; j < col; j++) {
        		int cell = matrix.get(i).get(j);
        		if (cell == 0) nR.add(0);
        		else {
        			int min = Integer.MAX_VALUE;
        			if (i > 0) min = Math.min(matrix.get(i - 1).get(j), min);
        			if (j < col - 1) min = Math.min(matrix.get(i).get(j + 1), min);
        			if (i < row - 1) min = Math.min(matrix.get(i + 1).get(j), min);
        			if (j > 0) min = Math.min(matrix.get(i).get(j - 1), min);
        			nR.add(min + 1);
        		}
        	}
        	nM.add(nR);
        }
        return nM;
    }
}
/*
Input: [[1, 0, 1, 1, 0, 0, 1, 0, 0, 1], [0, 1, 1, 0, 1, 0, 1, 0, 1, 1], [0, 0, 1, 0, 1, 0, 0, 1, 0, 0], [1, 0, 1, 0, 1, 1, 1, 1, 1, 1], [0, 1, 0, 1, 1, 0, 0, 0, 0, 1], [0, 0, 1, 0, 1, 1, 1, 0, 1, 0], [0, 1, 0, 1, 0, 1, 0, 0, 1, 1], [1, 0, 0, 0, 1, 1, 1, 1, 0, 1], [1, 1, 1, 1, 1, 1, 1, 0, 1, 0], [1, 1, 1, 1, 0, 1, 0, 0, 1, 1]]
Output: [[1,0,1,1,0,0,1,0,0,1],[0,1,1,0,1,0,1,0,1,1],[0,0,1,0,1,0,0,1,0,0],[1,0,1,0,1,1,1,1,1,1],[0,1,0,1,1,0,0,0,0,1],[0,0,1,0,1,1,1,0,1,0],[0,1,0,1,0,1,0,0,1,1],[1,0,0,0,1,2,1,1,0,1],[2,1,1,1,1,2,1,0,1,0],[2,2,2,1,0,1,0,0,1,1]]
Expected: [[1,0,1,1,0,0,1,0,0,1],[0,1,1,0,1,0,1,0,1,1],[0,0,1,0,1,0,0,1,0,0],[1,0,1,0,1,1,1,1,1,1],[0,1,0,1,1,0,0,0,0,1],[0,0,1,0,1,1,1,0,1,0],[0,1,0,1,0,1,0,0,1,1],[1,0,0,0,1,2,1,1,0,1],[2,1,1,1,1,2,1,0,1,0],[3,2,2,1,0,1,0,0,1,1]]
*/