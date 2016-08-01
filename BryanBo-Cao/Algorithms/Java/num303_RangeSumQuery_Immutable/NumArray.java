/**
https://leetcode.com/problems/range-sum-query-immutable/
303. Range Sum Query - Immutable  QuestionEditorial Solution  My Submissions
Total Accepted: 38170 Total Submissions: 149893 Difficulty: Easy
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
1. You may assume that the array does not change.
2. There are many calls to sumRange function.

 */
package algorithms.num303_RangeSumQuery_Immutable;

public class NumArray {
	
	int[] nums = null;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int index = i; index <= j; index++) sum += this.nums[index];
        return sum;
    }
}

// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);

//20160731Sun15:24 duration:3m28s12 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
