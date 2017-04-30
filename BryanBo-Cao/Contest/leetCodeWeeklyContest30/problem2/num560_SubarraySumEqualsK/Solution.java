package leetCodeWeeklyContest30.problem2.num560_SubarraySumEqualsK;

public class Solution {
    public int subarraySum(int[] nums, int k) {
    	int len = nums.length;
        if (nums == null || nums.length == 0) return 0;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
        	int sum = 0;
        	for (int j = i; j < len; j++) {
        		sum += nums[j];
        		if (sum == k) cnt++;
        	}
        }
        return cnt;
    }
}
/*
https://leetcode.com/contest/leetcode-weekly-contest-30/problems/subarray-sum-equals-k/
560. Subarray Sum Equals K My SubmissionsBack To Contest
User Accepted: 673
User Tried: 889
Total Accepted: 1272
Total Submissions: 2810
Difficulty: Medium
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
Note:
The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
//SolvedOn20170429SatNight CodingDuration:27m39s39
/*
Wrong cases:
Input:
[1]
0
Output:
1
Expected:
0

Input:
[-1,-1,1]
0
Output:
0
Expected:
1

Input:
[0,0,0,0,0,0,0,0,0,0]
0
Output:
10
Expected:
55
*/