package leetCodeHigh.num041_FirstMissingPositive;

public class Solution_FromOther {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++)
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);    
        
        for (int i = 0; i < n; i++)
            if (nums[i] != i + 1)
                return i + 1;
        
        return n + 1;
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }    
}
//https://leetcode.com/problems/first-missing-positive/#/description
/*
41. First Missing Positive Add to List
DescriptionSubmissionsSolutions
Total Accepted: 92195
Total Submissions: 366184
Difficulty: Hard
Contributor: LeetCode
Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space.
*/
//From https://discuss.leetcode.com/topic/8293/my-short-c-solution-o-1-space-and-o-n-time
//Author https://discuss.leetcode.com/user/makuiyu
//From https://discuss.leetcode.com/topic/8293/my-short-c-solution-o-1-space-and-o-n-time/25
//Author https://discuss.leetcode.com/user/sen8
//O(n) time, O(1) space
//PracticedOn20170401Sat5Times