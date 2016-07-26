/**
https://leetcode.com/problems/product-of-array-except-self/
238. Product of Array Except Self My Submissions QuestionEditorial Solution
Total Accepted: 50574 Total Submissions: 115641 Difficulty: Medium
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */
package algorithms.num238_ProductExceptSelf;


public class Solution {
    public int[] productExceptSelf(int[] nums) {
    	
    	if (nums == null) return null;
    	if (nums.length == 1) return new int[1];
    	
    	int productExceptSelf = 1;
    	for (int i = 1; i < nums.length; i++) {
    		productExceptSelf *= nums[i];
    		if (nums[i] == 0) break;
    	}
    	int[] productArray = new int[nums.length];
    	productArray[0] = productExceptSelf;
    	
    	for (int i = 1; i < nums.length; i++) {
    		int j = i;
    		if (nums[j] == 0) {
    			int product = 1;
    			for (int k = 0; k < nums.length; k++) {
    				if (k != j) {
    					product *= nums[k];
    					if (nums[k] == 0) {
        					product = 0;
        					break;
        				}
    				}
    			}
    			productArray[i] = product;
    		} else {
    			productExceptSelf /= nums[j--];
    			productExceptSelf *= nums[j];
    			productArray[i] = productExceptSelf;
    		}
    		
    	}
    	return productArray;
    }
}
//20160627Mon12:52 duration:27m54s81 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao