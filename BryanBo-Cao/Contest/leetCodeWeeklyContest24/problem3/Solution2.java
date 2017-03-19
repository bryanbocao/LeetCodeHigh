package leetCodeWeeklyContest24.problem3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    public List<List<Integer>> updateMatrix(List<List<Integer>> matrix) {
        int row = matrix.size(), col = matrix.get(0).size();
        List<List<Integer>> nM = new ArrayList<List<Integer>>();
        for (int i = 0; i < row; i++) {
        	List<Integer> nR = new ArrayList<Integer>();
        	for (int j = 0; j < col; j++) {
        		int cell = matrix.get(i).get(j);
        		if (cell == 0) nR.add(cell);
        		else {
        			Queue<Integer> q = new LinkedList<Integer>();
        			q.offer(i);
        			q.offer(j);
        			boolean[][] checked = new boolean[row][col];
        			int preI = i, preJ = j, dist = cell;
        			while (q.size() > 0) {
            			if (i > 0 && !checked[i - 1][j]) {
            				q.offer(i - 1);
            				q.offer(j);
            				checked[i - 1][j] = true;
            			}
            			if (j < col && !checked[i][j + 1]) {
            				q.offer(i);
            				q.offer(j + 1);
            				checked[i][j + 1] = true;
            			}
            			if (i < row && !checked[i + 1][j]) {
            				q.offer(i + 1);
            				q.offer(j);
            				checked[i + 1][j] = true;
            			}
            			if (j > 0 && !checked[i][j - 1]) {
            				q.offer(i);
            				q.offer(j - 1);
            				checked[i][j - 1] = true;
            			}
            			
        				int furtherI = q.poll(), furtherJ = q.poll();
        				if (matrix.get(furtherI).get(furtherJ) == 0) {
        					
        					break;
        				} else if (matrix.get(ii).get(jj) == 1) {
        					
        				}
        				
        				
        			}
        		}
        	}
        	nM.add(nR);
        }
        return nM;
    }
}
