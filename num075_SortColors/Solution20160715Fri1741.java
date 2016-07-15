/**
https://leetcode.com/problems/sort-colors/
75. Sort Colors  QuestionEditorial Solution  My Submissions
Total Accepted: 106479 Total Submissions: 301600 Difficulty: Medium
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.

click to show follow up.

Follow up:
A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.

Could you come up with an one-pass algorithm using only constant space?
 */

package algorithms.num075_SortColors;

public class Solution20160715Fri1741 {
    public void sortColors(int[] nums) {
    	
    	int redTail = 0, blueHead = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
        	switch (nums[i]) {
        	case 0:
        		if (i == redTail) redTail++;
        		else {
        			int t = nums[i];
        			nums[i] = nums[redTail];
        			nums[redTail] = t;
        			while (nums[redTail] == 0 && redTail < blueHead) redTail++;
        		}
        		break;
        	case 2:
        		while (nums[blueHead] == 2 && blueHead > redTail) blueHead--;
        		if (nums[blueHead] == 0) {
        			int t = nums[i];
            		nums[i] = nums[blueHead];
            		nums[blueHead] = t;
            		blueHead--;
        		} else {//nums[blueHead] == 1
        			for (int j = blueHead; j > redTail;j--) {
        				if (nums[j] == 0) {
        					int t = nums[j];
        					nums[j] = nums[blueHead];
        					nums[blueHead] = t;
        					
        					t = nums[i];
        					nums[i] = nums[blueHead];
        					nums[blueHead] = t;
        					break;
        				} else if (nums[j] == 2) {
        					int t = nums[j];
        					nums[j] = nums[blueHead];
        					nums[blueHead] = t;
        					break;
        				}
        			}
        		}
        		System.out.println("i: " + i + " redTail: " + redTail + " blueHead: " + blueHead);
        		break;
        	}
        	
        	for (int ii = 0; ii < nums.length; ii++) {
        		System.out.print(nums[ii] + " ");
        	}
        	System.out.println();
        	System.out.println();
    	}
    }
    
}
//20160715Fri17:41 duration:46m32s04 Unsolved @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao