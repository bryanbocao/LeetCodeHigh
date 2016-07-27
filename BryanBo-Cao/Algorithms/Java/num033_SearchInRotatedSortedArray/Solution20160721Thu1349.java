/**
https://leetcode.com/problems/search-in-rotated-sorted-array/
33. Search in Rotated Sorted Array  QuestionEditorial Solution  My Submissions
Total Accepted: 110680 Total Submissions: 359647 Difficulty: Hard
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
 */
package algorithms.num033_SearchInRotatedSortedArray;

public class Solution20160721Thu1349 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return -1;
        else if (len == 1) {
        	if (nums[0] == target) return 0;
        	else return -1;
        } else {//len > 1
        	if (nums[0] == target) return 0;
        	int min = 0, max = len - 1, mid = 0;
        	while (min <= max) {
        		mid = (min + max) / 2;
        		if (nums[min] > nums[max]) {//rotated
        			System.out.println("rotated");
        			System.out.println("nums[mid]: " + nums[mid] + " mid: " + mid + " min: " + min + " max: " + max);
        			if (nums[mid] == target) return mid;
        			else if (nums[max] < target && nums[min] > target) min = max + 1;
        			else if (nums[mid] < target) {
        				if (nums[min] < nums[mid]) min = mid + 1;
        				else max = mid - 1;
        			} else {//nums[mid] > target
        				if (nums[min] < nums[mid]) min = mid + 1;
        				else max = mid - 1;
        			}
        		} else {//not rotated
        			System.out.println("not rotated");
        			System.out.println("nums[mid]: " + nums[mid] + " mid: " + mid + " min: " + min + " max: " + max);
        			if (nums[mid] == target) return mid;
        			else if (nums[mid] < target) min = mid + 1;
        			else max = mid - 1;//nums[mid] > target
        		}
        	}
        	return -1;
        }
    }
}
//20160721Thu13:49 duration:20m08s60 NotFinished(GoingToChangeStrategy) @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao