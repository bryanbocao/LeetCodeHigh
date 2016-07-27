/**
https://leetcode.com/problems/pascals-triangle-ii/
119. Pascal's Triangle II My Submissions QuestionEditorial Solution
Total Accepted: 80491 Total Submissions: 243618 Difficulty: Easy
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 */
package algorithms.num119_PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls = new ArrayList<Integer>();
        if (rowIndex == 0) {
        	ls.add(1);
        	return ls;
        } else if (rowIndex == 1) {
        	ls.add(1); ls.add(1);
        	return ls;
        } else {
    		ls.add(1);
    		ls.add(1);
    		int[] preArray = new int[2];
    		preArray[0] = 1;
    		preArray[1] = 1;
            for (int i = 2; i <= rowIndex; i++) {
            	ls = new ArrayList<Integer>();
            	int[] tPreArray = new int[i + 1];
            	for (int j = 0; j < i + 1; j++) {
                	if (j == 0 || j == i) {
                		ls.add(1);
                		tPreArray[j] = 1;
                	} else {
                		int value = preArray[j - 1] + preArray[j];
                		ls.add(value);
                		tPreArray[j] = value;
                	}
            	}
            	preArray = tPreArray;
            	if (i == rowIndex) return ls;
            }
            return ls;
        }

    }
}
//20160704Mon16:37 duration:8m28s92 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao