package leetCode.num259_3SumSmaller;

import java.util.Arrays;

public class Solution_FromOther_BryanBCRevision {
    public int threeSumSmaller(int[] nums, int target) {
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length-3; i++) {
            int lo = i+1;
            int hi = nums.length-1;
            while(lo < hi) {
                if(nums[i] + nums[lo] + nums[hi] < target) {
                    result += hi - lo;
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return result;
    }
}
/*
https://leetcode.com/problems/3sum-smaller/#/description
259. 3Sum Smaller Add to List
DescriptionSubmissionsSolutions
Total Accepted: 23081
Total Submissions: 56260
Difficulty: Medium
Contributor: LeetCode
Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.

For example, given nums = [-2, 0, 1, 3], and target = 2.

Return 2. Because there are two triplets which sums are less than 2:

[-2, 0, 1]
[-2, 0, 3]
Follow up:
Could you solve it in O(n2) runtime?
*/
/*
From https://discuss.leetcode.com/topic/26642/accepted-and-simple-java-o-n-2-solution-with-detailed-explanation
Author https://discuss.leetcode.com/user/kevinhsu
*/
