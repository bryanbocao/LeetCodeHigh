/**
https://leetcode.com/problems/remove-element/
27. Remove Element  QuestionEditorial Solution  My Submissions
Total Accepted: 130597 Total Submissions: 374105 Difficulty: Easy
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

Hint:

Try two pointers.
Did you use the property of "the order of elements can be changed"?
What happens when the elements to remove are rare?
 */
package algorithms.num027_RemoveElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution20160720Wed1804 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0) return 0;
        else {
            int i = 0, l = nums.length - 1;
            do {
            	if (nums[i] == val) {
            		len--;
            		while (nums[l] == val && i < l - 1) {
            			l--;
            			len--;
            		}
            		if (i < l) {
                		int t = nums[i];
                		nums[i] = nums[l];
                		nums[l] = t; 
            		}
            	}
            	i++;
            } while (i < nums.length && i < l - 1);
            if (i == l && nums[i] == val) len--;
            return len;
        }

    }
}
//20160720Wed18:04 duration:36m06s97 NotFinished Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao