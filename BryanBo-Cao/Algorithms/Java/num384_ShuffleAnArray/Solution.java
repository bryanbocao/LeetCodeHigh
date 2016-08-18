/**
https://leetcode.com/problems/shuffle-an-array/
384. Shuffle an Array  QuestionEditorial Solution  My Submissions
Total Accepted: 1190
Total Submissions: 2630
Difficulty: Medium
Shuffle a set of numbers without duplicates.

Example:

// Init an array with set 1, 2, and 3.
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
solution.shuffle();

// Resets the array back to its original configuration [1,2,3].
solution.reset();

// Returns the random shuffling of array [1,2,3].
solution.shuffle();
 */
package algorithms.num384_ShuffleAnArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Solution {
	int[] nums = null;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	List<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < this.nums.length; i++) ls.add(nums[i]);
        Collections.shuffle(ls);
        int[] resultArray = new int[this.nums.length];
        Iterator<Integer> it = ls.iterator();
        for (int i = 0; i < this.nums.length; i++) resultArray[i] = it.next();
        return resultArray;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
//20160812Fri19:48 CodingDuration:12m14s56 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
