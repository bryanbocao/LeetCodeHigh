/*20160601Wed12:03
Total Accepted: 12388 Total Submissions: 27724 Difficulty: Easy
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 */

package algorithms.num349_IntersectionOfTwoArrays;
import java.util.*;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	Set<Integer> set1 = new HashSet<Integer>(),
    			set2 = new HashSet<Integer>();
    	for (int i = 0; i < nums1.length; i++) {
    		set1.add(nums1[i]);
    	}
    	for (int i = 0; i < nums2.length; i++) {
    		set2.add(nums2[i]);
    	}
    	set1.retainAll(set2);
    	int[] arr = new int[set1.size()];
    	Iterator<Integer> it = set1.iterator();
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] = it.next();
    	}
        return arr;
    }
}
//20160601Wed12:27 duration:23m33s97 @BryanBo-Cao
