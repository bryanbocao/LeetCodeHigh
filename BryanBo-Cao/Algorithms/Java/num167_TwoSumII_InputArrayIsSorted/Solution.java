/**
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
Locked Question
 */
package algorithms.num167_TwoSumII_InputArrayIsSorted;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int lo = 0, hi = numbers.length - 1, sum = numbers[lo] + numbers[hi];
    	while (sum != target) {
    		if (sum < target) lo++;
    		else hi--;
    		sum = numbers[lo] + numbers[hi];
    	}
    	return new int[]{lo + 1, hi + 1};
    }
}
//20160811Thu00:19 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
