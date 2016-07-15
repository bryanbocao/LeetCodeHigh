/**
https://leetcode.com/problems/summary-ranges/
228. Summary Ranges  QuestionEditorial Solution  My Submissions
Total Accepted: 50483 Total Submissions: 199803 Difficulty: Medium
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
package algorithms.num228_SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<String>();
        if (nums.length == 0) return ls;
        else if (nums.length == 1) ls.add(new Integer(nums[0]).toString());
        else {
        	StringBuffer sb = new StringBuffer();
        	int lastHead = nums[0], pre = nums[0];
        	for (int i = 1; i < nums.length; i++) {
        		if (pre + 1 == nums[i]) pre = nums[i];
        		else {
        			String s;
        			if (lastHead == pre) s = new Integer(pre).toString();
        			else s = new Integer(lastHead) + "->" + new Integer(pre);
        			ls.add(s);
        			pre = nums[i];
        			lastHead = nums[i];
        		}
        		if (i == nums.length - 1) {
        			String s;
        			if (lastHead == nums[i]) s = new Integer(nums[i]).toString();
        			else s = new Integer(lastHead) + "->" + new Integer(nums[i]);
        			ls.add(s);
        		}
        	}
        }
        return ls;
    }
}
//20160714Thu16:14 duration:14m45s97 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao