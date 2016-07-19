/**
https://leetcode.com/problems/maximum-gap/
164. Maximum Gap  QuestionEditorial Solution  My Submissions
Total Accepted: 34646
Total Submissions: 126559
Difficulty: Hard
Given an unsorted array, find the maximum difference between the successive elements in its sorted form.

Try to solve it in linear time/space.

Return 0 if the array contains less than 2 elements.

You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.
 */
package algorithms.num164_MaximumGap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        else {
        	List<Integer> ls = new ArrayList<Integer>();
        	for (int i = 0; i < nums.length; i++) ls.add(nums[i]);
        	Collections.sort(ls);
        	Iterator<Integer> it = ls.iterator();
        	int pre = it.next(), maxD = 0;
        	while (it.hasNext()) {
        		int next = it.next();
        		if (next - pre > maxD) maxD = next - pre;
        		pre = next;
        	}
        	return maxD;
        }
    }
}
//20160718Mon22:01 duration:10m20s22 Accepted duration:7m11s06 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao