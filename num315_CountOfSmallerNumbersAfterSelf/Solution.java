/**
https://leetcode.com/problems/count-of-smaller-numbers-after-self/
315. Count of Smaller Numbers After Self My Submissions QuestionEditorial Solution
Total Accepted: 12407 Total Submissions: 39672 Difficulty: Hard
You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

Example:

Given nums = [5, 2, 6, 1]

To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Return the array [2, 1, 1, 0].


 */
package algorithms.num315_CountOfSmallerNumbersAfterSelf;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> countSmaller(int[] nums) {
    	List<Integer> ls = new ArrayList<Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		int cnts = 0;
    		for (int j = i + 1; j < nums.length; j++) {
    			if (nums[j] < nums[i]) cnts++;
    		}
    		ls.add(cnts);
    	}
    	return ls;
    }
}
//20160623Thu11:43 duration:5m53s44 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao