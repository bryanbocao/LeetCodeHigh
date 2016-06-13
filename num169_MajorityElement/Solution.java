/*
 * 169. Majority Element My Submissions QuestionEditorial Solution
Total Accepted: 119784 Total Submissions: 285306 Difficulty: Easy
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */

package algorithms.num169_MajorityElement;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maj = (int) Math.floor(nums.length / 2);
        int max = 0, naxNum = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (map.containsKey(nums[i])) {
        		int thisValue = map.get(nums[i]);
        		map.put(nums[i], thisValue + 1);
        		if (thisValue > max) {
        			max = thisValue;
        			naxNum = nums[i];
        		}
        	} else map.put(nums[i], 1);
        	if (map.get(nums[i]) > maj) return nums[i];
        }
        return naxNum;
    }
}
//20160613Mon09:26 duration:14m08s75 ACCEPTED @BryanBo-Cao