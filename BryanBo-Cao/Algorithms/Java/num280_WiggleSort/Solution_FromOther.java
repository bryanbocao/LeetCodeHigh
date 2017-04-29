package leetCode.num280_WiggleSort;

public class Solution_FromOther {
    public void wiggleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i - 1];
            if ((i % 2 == 1) == (a > nums[i])) {
                nums[i - 1] = nums[i];
                nums[i] = a;
            }
        }
    }
}
/*
https://leetcode.com/problems/wiggle-sort/
280. Wiggle Sort Add to List
DescriptionSubmissionsSolutions
Total Accepted: 25805
Total Submissions: 46011
Difficulty: Medium
Contributor: LeetCode
Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
*/
/*
From https://discuss.leetcode.com/topic/23871/java-o-n-solution/2
Author https://discuss.leetcode.com/user/stefanpochmann
From https://discuss.leetcode.com/topic/23871/java-o-n-solution
Author https://discuss.leetcode.com/user/walkerix
*/
//PracticedOn20170403Mon 5Times
