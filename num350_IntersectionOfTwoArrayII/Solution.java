/**
https://leetcode.com/problems/intersection-of-two-arrays-ii/
350. Intersection of Two Arrays II My Submissions QuestionEditorial Solution
Total Accepted: 13532 Total Submissions: 32614 Difficulty: Easy
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
package algorithms.num350_IntersectionOfTwoArrayII;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    	if (nums1 == null || nums2 == null) return null;
    	else {
        	List<Integer> ls = new ArrayList<Integer>(),
        			lsr = new ArrayList<Integer>();
        	for (int i = 0; i < nums1.length; i++) ls.add(nums1[i]);
        	for (int i = 0; i < nums2.length; i++) {
        		if (ls.contains(nums2[i])) {
        			lsr.add(nums2[i]);
        			ls.remove(new Integer(nums2[i]));
        		}
        	}
        	int[] arr = new int[lsr.size()];
        	Iterator<Integer> it = lsr.iterator();
        	int i = 0;
        	while (it.hasNext()) {
        		arr[i++] = it.next();
        	}
        	return arr;
    	}
    }
}
//20160618Sat15:14 duration:21m Accepted @BryanBo-Cao 