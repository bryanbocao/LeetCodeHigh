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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return -1;
        else if (len == 1) {
        	if (nums[0] == target) return 0;
        	else return -1;
        } else {//len > 1
        	
        	if (nums[0] == target) return 0;
        	int min = 0, max = len - 1, mid = 0, pivot = -1;
        	//if rotated, find the pivot
        	if (nums[min] > nums[max]) {
            	while (nums[min] > nums[max]) {
            		mid = (min + max) / 2;
            		if (mid - 1 >= 0 && nums[mid] < nums[mid - 1]) {
            			pivot = mid;
            			break;
            		} else if (mid + 1 < len && nums[mid] > nums[mid + 1]) {
            			pivot = mid + 1;
            			break;
            		} else if (nums[mid] < nums[min] && nums[mid] < nums[max]) max = mid - 1;
            		else if (nums[mid] > nums[min] && nums[mid] > nums[max]) min = mid + 1;
            	}
            	List<Integer> ls = new ArrayList<Integer>();
            	for (int i = 0; i < len; i++) ls.add(nums[i]);
            	Collections.sort(ls);
            	boolean found = false;
            	min = 0; max = len - 1;
            	while (min <= max) {
            		mid = (min + max) / 2;
            		if (ls.get(mid) == target) {
            			found = true;
            			break;
            		} else if (ls.get(mid) < target) min = mid + 1;
            		else max = mid - 1;//nums[mid] > target
            	}
            	if (found) return (mid + pivot) % len;
            	else return -1;
        	} else {
            	if (nums[0] == target) return 0;
            	while (min <= max) {
            		mid = (min + max) / 2;
            		if (nums[mid] == target) return mid;
        			else if (nums[mid] < target) min = mid + 1;
            		else max = mid - 1;//nums[mid] > target
            	}
            	return -1;
        	}
        	
        }
    }
    
}
//20160721Thu15:47 duration:15m38s52 Accepted(CouldBeImproved) @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao