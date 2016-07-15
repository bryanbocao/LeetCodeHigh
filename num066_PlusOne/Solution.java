/**
https://leetcode.com/problems/plus-one/
66. Plus One  QuestionEditorial Solution  My Submissions
Total Accepted: 110409 Total Submissions: 318123 Difficulty: Easy
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
 */
package algorithms.num066_PlusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
    	int[] result;
        if (digits.length == 0) {
        	result = new int[1];
        	result[0] = 1;
        	return result;
        } else {
        	if (digits[digits.length - 1] < 9) {
        		digits[digits.length - 1]++;
        		return digits;
        	} else {
        		int carry = 1;
        		for (int i = digits.length - 1; i >= 0; i--) {
        			if (digits[i] == 9) {
        				if (i == 0) return getArray(digits.length + 1);
        				else if (carry == 1) digits[i] = 0;
        				else return digits;
        			} else {
        				if (carry == 1) {
        					digits[i]++;
        					carry--;
        				} else return digits;
        			}
        		}
        		
        	}
        }
        return digits;
    }
    
    private int[] getArray(int len) {
    	int[] result = new int[len];
    	result[0] = 1;
    	for (int i = 1; i < len; i++) result[i] = 0;
    	return result;
    }
}
//20160714Thu17:01 duration:16m08s08 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao