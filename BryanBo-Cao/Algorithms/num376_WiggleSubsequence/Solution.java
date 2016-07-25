/**
https://leetcode.com/problems/wiggle-subsequence/
376. Wiggle Subsequence  QuestionEditorial Solution  My Submissions
Total Accepted: 1829 Total Submissions: 5023 Difficulty: Medium
A sequence of numbers is called a wiggle sequence if the differences between successive numbers strictly alternate between positive and negative. The first difference (if one exists) may be either positive or negative. A sequence with fewer than two elements is trivially a wiggle sequence.

For example, [1,7,4,9,2,5] is a wiggle sequence because the differences (6,-3,5,-7,3) are alternately positive and negative. In contrast, [1,4,7,2,5] and [1,7,4,5,5] are not wiggle sequences, the first because its first two differences are positive and the second because its last difference is zero.

Given a sequence of integers, return the length of the longest subsequence that is a wiggle sequence. A subsequence is obtained by deleting some number of elements (eventually, also zero) from the original sequence, leaving the remaining elements in their original order.

Examples:
Input: [1,7,4,9,2,5]
Output: 6
The entire sequence is a wiggle sequence.

Input: [1,17,5,10,13,15,10,5,16,8]
Output: 7
There are several subsequences that achieve this length. One is [1,17,10,13,10,16,8].

Input: [1,2,3,4,5,6,7,8,9]
Output: 2
Follow up:
Can you do it in O(n) time?


 */
package algorithms.num376_WiggleSubsequence;

public class Solution {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if (len <= 1) return len;
        else {
        	int pre = nums[0];
        	boolean asc = false;
        	int cnt = 1;
        	if (pre < nums[1]) asc = true;
        	if (pre != nums[1]) cnt++;
        	pre = nums[1];
        	for (int i = 2; i < len; i++) {
        		if (asc) {
        			if (pre > nums[i]) {
        				cnt++;
        				asc = false;
        			}
        		} else {
        			if (pre < nums[i]) {
        				cnt++;
        				asc = true;
        			}
        		}
        		pre = nums[i];
        	}
        	
        	return cnt;
        }
    }
}
//20160723Sat13:58 duration:15m03s0 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 