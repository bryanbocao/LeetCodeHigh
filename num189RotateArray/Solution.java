/**
 * 189. Rotate Array My Submissions QuestionEditorial Solution
Total Accepted: 75189 Total Submissions: 348690 Difficulty: Easy
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 */
package algorithms.num189RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) temp[i] = nums[i];
        for (int i = 0; i < nums.length; i++) {
        	int inew = i - k;
        	while (inew < 0) inew += nums.length;
        	nums[i] = temp[inew];
        }
    }
}
//20160605Sun duration: 13m10s33 ACCEPTED @BryanBo-Cao