/**
https://leetcode.com/problems/longest-increasing-subsequence/
300. Longest Increasing Subsequence My Submissions QuestionEditorial Solution
Total Accepted: 32891 Total Submissions: 94173 Difficulty: Medium
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?


 */
package algorithms.num300_LongestIncreasingSequence;

public class Solution {
    public int lengthOfLIS(int[] nums) {
    	if (nums.length == 0) return 0;
    	else {
            int maxlen = 1;
            for (int i = 0; i < nums.length; i++) {
            	int prepre = nums[i], pre = nums[i], tempmaxlen = 1;
            	for (int j = i + 1; j < nums.length; j++) {
            		if (nums[j] > pre) {
            			if (j - 2 >= 0) prepre = pre;
            			pre = nums[j];
            			tempmaxlen++;
            		} else if (j - 2 >= 0 && nums[j] > prepre) {
            			prepre = pre;
            			pre = nums[j];
            		}
            	}
            	if (tempmaxlen > maxlen) maxlen = tempmaxlen;
            }
            return maxlen;
    	}
    }
}
//20160622Tue13:57 duration:20m28s68 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao