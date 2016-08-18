/**
https://leetcode.com/problems/sort-transformed-array/
Locked Question
 */
package algorithms.num360_SortTransformedArray;

public class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
    	int len = nums.length;
    	int[] arr = new int[len];
		int preI = 0, postI = len - 1, pre = 0, post = 0;
		boolean gotPre = false, gotPost = false;
    	if (a == 0) {
    		if (b >= 0) for (int i = 0; i < len; i++) arr[i] = b * nums[i] + c;
    		else for (int i = 0; i < len; i++) arr[i] = b * nums[len - 1 - i] + c;
    	} else if (a > 0) {
    		for (int i = len - 1; i >= 0; i--) {
    			if (!gotPre) {
    				pre = a * nums[preI] * nums[preI] + b * nums[preI] + c;
    				preI++;
    				gotPre = true;
    			}
    			if (!gotPost) {
    				post = a * nums[postI] * nums[postI] + b * nums[postI] + c;
    				postI--;
    				gotPost = true;
    			}
    			if (pre > post) {
    				arr[i] = pre;
    				gotPre = false;
    			} else {
    				arr[i] = post;
    				gotPost = false;
    			}
    		}
    	} else if (a < 0) {
    		for (int i = 0; i < len; i++) {
    			if (!gotPre) {
    				pre = a * nums[preI] * nums[preI] + b * nums[preI] + c;
    				preI++;
    				gotPre = true;
    			}
    			if (!gotPost) {
    				post = a * nums[postI] * nums[postI] + b * nums[postI] + c;
    				postI--;
    				gotPost = true;
    			}
    			if (pre < post) {
    				arr[i] = pre;
    				gotPre = false;
    			} else {
    				arr[i] = post;
    				gotPost = false;
    			}
    		}
    	}
    	return arr;
    }
}
//FinishedOn20160815MonAt05:33 CodingDuration:33m57s37 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
