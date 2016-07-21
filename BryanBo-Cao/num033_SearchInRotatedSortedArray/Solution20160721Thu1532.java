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

public class Solution20160721Thu1532 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return -1;
        else if (len == 1) {
        	if (nums[0] == target) return 0;
        	else return -1;
        } else {//len > 1
        	
        	if (nums[0] == target) return 0;
        	int min = 0, max = len - 1, mid = 0, pivot = 0;
        	int newMin = min, newMax = max, newMid = mid;
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
            	min = 0;
            	max = len - 1;
            	newMin = pivot;
            	newMax = pivot - 1;
        	}
        	if (nums[newMin] == target) return min + pivot;
        	System.out.println("pivot: " + pivot);
        	System.out.println("nums[mid]: " + nums[mid] + " mid: " + mid + " min: " + min + " max: " + max);
        	while (min <= max) {
        		newMin = (min + pivot) % len;
        		newMax = (max + pivot) % len;
        		System.out.println("while: ");
        		mid = (min + max) / 2;
        		newMid = (newMin + newMax) / 2;
        		System.out.println("nums[mid % len]: " + nums[mid % len] + " mid: " + mid + " min: " + min + " max: " + max);
        		System.out.println("nums[newMid]: " + nums[newMid] + " newMid: " + newMid + " newmin: " + newMin + " newMax: " + newMax);
        		if (nums[newMid] == target) return newMid;
    			else if (nums[newMid] < target) min = mid + 1;
        		else max = mid - 1;//nums[mid] > target
        	}
        	System.out.println("end nums[mid % len]: " + nums[mid % len] + " mid: " + mid + " min: " + min + " max: " + max);
        	return -1;
        	
        }
    }
}
/*
 * [20 ,30 ,40 ,50 ,1 ,2 ,3 ,4 ,5, 6, 7 ,8 ,9 ,10]
0
 */
//20160721Thu15:32 NotFinished @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao