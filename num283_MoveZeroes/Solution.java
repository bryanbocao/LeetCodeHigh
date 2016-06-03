/*20160602Thu16:15

Total Accepted: 86067 Total Submissions: 192553 Difficulty: Easy
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

package algorithms.num283_MoveZeroes;
public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
        	if (i + 1 < nums.length && nums[i] == 0) {
        		int j = i + 1;
        		boolean foundNotZero = false;
        		while (j < nums.length) {
        		    if (nums[j] != 0) {
        		        foundNotZero = true;
        		        break;
        		    }
        			j++;
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
//20160603Fri11:23 duration: 13m51s90 @BryanBo-Cao Accepted