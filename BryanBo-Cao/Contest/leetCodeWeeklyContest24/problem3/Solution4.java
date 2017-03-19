package leetCodeWeeklyContest24.problem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution4 {
    public List<List<Integer>> updateMatrix(List<List<Integer>> matrix) {
        int row = matrix.size(), col = matrix.get(0).size();
        List<List<Integer>> nM = new ArrayList<List<Integer>>();
        List<Integer> doubleCheckLs = new ArrayList<Integer>();
        for (int i = 0; i < row; i++) {
        	List<Integer> nR = new ArrayList<Integer>();
        	for (int j = 0; j < col; j++) {
        		int cell = matrix.get(i).get(j);
        		if (cell == 0) nR.add(0);
        		else {
        			int min = Integer.MAX_VALUE;
        			boolean inner = true;
        			if (i > 0) {
        				int furtherCell = matrix.get(i - 1).get(j);
        				if (furtherCell == 0) inner = false;
        				min = Math.min(furtherCell, min);
        			}
        			if (j < col - 1) {
        				int furtherCell = matrix.get(i).get(j + 1);
        				if (furtherCell == 0) inner = false;
        				min = Math.min(furtherCell, min);
        			}
        			if (i < row - 1) {
        				int furtherCell = matrix.get(i + 1).get(j);
        				if (furtherCell == 0) inner = false;
        				min = Math.min(furtherCell, min);
        			}
        			if (j > 0) {
        				int furtherCell = matrix.get(i).get(j - 1);
        				if (furtherCell == 0) inner = false;
        				min = Math.min(furtherCell, min);
        			}
        			nR.add(min + 1);
        			if (inner) {
        				doubleCheckLs.add(i);
        				doubleCheckLs.add(j);
        			}
        		}
        	}
        	nM.add(nR);
        }
        
        //double check
        if (doubleCheckLs.size() > 0) {
        	Iterator<Integer> it = doubleCheckLs.iterator();
        	while (it.hasNext()) {
        		int i = it.next(), j = it.next();
        		int min = Integer.MAX_VALUE;
    			if (i > 0) {
    				int furtherCell = matrix.get(i - 1).get(j);
    				min = Math.min(furtherCell, min);
    			}
    			if (j < col - 1) {
    				int furtherCell = matrix.get(i).get(j + 1);
    				min = Math.min(furtherCell, min);
    			}
    			if (i < row - 1) {
    				int furtherCell = matrix.get(i + 1).get(j);
    				min = Math.min(furtherCell, min);
    			}
    			if (j > 0) {
    				int furtherCell = matrix.get(i).get(j - 1);
    				min = Math.min(furtherCell, min);
    			}
    			nM.get(i).set(j, min + 1);
        	}
        }
        return nM;
    }
    
}
/*
Input: [[1, 0, 1, 1, 0, 0, 1, 0, 0, 1], 
		[0, 1, 1, 0, 1, 0, 1, 0, 1, 1], 
		[0, 0, 1, 0, 1, 0, 0, 1, 0, 0],
		[1, 0, 1, 0, 1, 1, 1, 1, 1, 1], 
		[0, 1, 0, 1, 1, 0, 0, 0, 0, 1], 
		[0, 0, 1, 0, 1, 1, 1, 0, 1, 0], 
		[0, 1, 0, 1, 0, 1, 0, 0, 1, 1], 
		[1, 0, 0, 0, 1, 1, 1, 1, 0, 1], 
		[1, 1, 1, 1, 1, 1, 1, 0, 1, 0], 
		[1, 1, 1, 1, 0, 1, 0, 0, 1, 1]]
		
Output: 	[[1,0,1,1,0,0,1,0,0,1],
		 	 [0,1,1,0,1,0,1,0,1,1],
		 	 [0,0,1,0,1,0,0,1,0,0],
		 	 [1,0,1,0,1,1,1,1,1,1],
		 	 [0,1,0,1,1,0,0,0,0,1],
		  	 [0,0,1,0,1,1,1,0,1,0],
		  	 [0,1,0,1,0,1,0,0,1,1],
		 	 [1,0,0,0,1,2,1,1,0,1],
		 	 [2,1,1,1,1,2,1,0,1,0],
		 	 [2,2,2,1,0,1,0,0,1,1]]
		 	 
Expected: 	[[1,0,1,1,0,0,1,0,0,1],
		   	 [0,1,1,0,1,0,1,0,1,1],
		   	 [0,0,1,0,1,0,0,1,0,0],
		   	 [1,0,1,0,1,1,1,1,1,1],
		   	 [0,1,0,1,1,0,0,0,0,1],
		   	 [0,0,1,0,1,1,1,0,1,0],
		   	 [0,1,0,1,0,1,0,0,1,1],
		   	 [1,0,0,0,1,2,1,1,0,1],
		   	 [2,1,1,1,1,2,1,0,1,0],
		   	 [3,2,2,1,0,1,0,0,1,1]]
*/