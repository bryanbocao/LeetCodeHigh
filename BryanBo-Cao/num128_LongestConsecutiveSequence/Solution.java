/**
https://leetcode.com/problems/longest-consecutive-sequence/
128. Longest Consecutive Sequence  QuestionEditorial Solution  My Submissions
Total Accepted: 70773 Total Submissions: 213466 Difficulty: Hard
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
 */
package algorithms.num128_LongestConsecutiveSequence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public int longestConsecutive(int[] nums) {
    	if (nums.length == 0) return 0;
    	else if (nums.length == 1) return 1;
    	else {
    		List<Integer> ls = new ArrayList<Integer>();
    		for (int i = 0; i < nums.length; i++) ls.add(nums[i]);
    		Collections.sort(ls);
    		Iterator<Integer> it = ls.iterator();
    		int len = 1, maxlen = 1, pre = it.next();
    		while (it.hasNext()) {
    			int next = it.next();
    			if (next == pre + 1) len++;
    			else if (next == pre) continue;
    			else {
    				if (len > maxlen) maxlen = len;
    				if (len != 1) len = 1;
    			}
    			pre = next;
    		}
    		if (len > maxlen) maxlen = len;
    		return maxlen;
    	}
    }
}
//20160719Tue15:11 duration:14m29s75 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao