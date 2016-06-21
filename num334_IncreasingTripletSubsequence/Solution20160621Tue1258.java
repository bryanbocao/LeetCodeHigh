/**
https://leetcode.com/problems/increasing-triplet-subsequence/
334. Increasing Triplet Subsequence My Submissions QuestionEditorial Solution
Total Accepted: 16512 Total Submissions: 47817 Difficulty: Medium
Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

Formally the function should:
Return true if there exists i, j, k 
such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
Your algorithm should run in O(n) time complexity and O(1) space complexity.

Examples:
Given [1, 2, 3, 4, 5],
return true.

Given [5, 4, 3, 2, 1],
return false.
 */
package algorithms.num334_IncreasingTripletSubsequence;

import java.util.Stack;

public class Solution20160621Tue1258 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int cnt = 0;
        Stack<Integer> stc = new Stack<Integer>();
        stc.push(nums[0]);
        int lastmin = stc.firstElement();
        for (int i = 1; i < nums.length; i++) {
        	if (nums[i] > lastmin) {
        		cnt++;
        		stc.pop();
        		if (stc.isEmpty()) stc.push(nums[i]);
        		lastmin = stc.lastElement();
        	} else if (nums[i] < lastmin) {
        		lastmin = nums[i];
        		stc.push(lastmin);
        	}
        	if (cnt >= 3) return true;
        }
        return false;
    }
}
