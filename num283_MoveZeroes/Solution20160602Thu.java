/*20160602Thu16:15

Total Accepted: 86067 Total Submissions: 192553 Difficulty: Easy
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

package algorithms.num283_MoveZeroes;
public class Solution20160602Thu {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == 0 && i + 1 <= nums.length - 1) {
        		int j = i + 1;
        		boolean foundNotZero = false;
        		while (nums[j] != 0) {
        			j++;
        			foundNotZero = true;
        		}
        		if (foundNotZero) {
        			int t = nums[i];
        			nums[i] = nums[j];
        			nums[j] = t;
        		}
        	}
        }
    }
}
//
/*
20160602Thu16:16 duration: 24m16s34 @BryanBo-Cao not passed
Run Code Result: ×
Your input

[0,1,0,3,12]
Your answer

[0,1,0,3,12]
Expected answer

[1,3,12,0,0]
Runtime: 0 ms
*/

