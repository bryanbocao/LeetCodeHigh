/**
https://leetcode.com/problems/pascals-triangle/
118. Pascal's Triangle My Submissions QuestionEditorial Solution
Total Accepted: 89670 Total Submissions: 261849 Difficulty: Easy
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
package algorithms.num118_PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        if (numRows == 0) return ls;
        else if (numRows == 1) {
        	List<Integer> lsi = new ArrayList<Integer>();
        	lsi.add(1);
        	ls.add(lsi);
        	return ls;
        } else {
        	List<Integer> lsi = new ArrayList<Integer>();
        	lsi.add(1);
        	ls.add(lsi);
        	lsi = new ArrayList<Integer>();
    		lsi.add(1);
    		lsi.add(1);
    		ls.add(lsi);
    		int[] preArray = new int[2];
    		preArray[0] = 1;
    		preArray[1] = 1;
            for (int i = 2; i < numRows; i++) {
            	lsi = new ArrayList<Integer>();
            	int[] tPreArray = new int[i + 1];
            	for (int j = 0; j < i + 1; j++) {
                	if (j == 0 || j == i) {
                		lsi.add(1);
                		tPreArray[j] = 1;
                	} else {
                		int value = preArray[j - 1] + preArray[j];
                		lsi.add(value);
                		tPreArray[j] = value;
                	}
            	}
            	preArray = tPreArray;
            	ls.add(lsi);
            }
            return ls;
        }

    }
}
//20160704Mon16:27 duration:34m43s32 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao