/**
https://leetcode.com/problems/top-k-frequent-elements/
347. Top K Frequent Elements My Submissions QuestionEditorial Solution
Total Accepted: 15889 Total Submissions: 37235 Difficulty: Medium
Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note: 
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
package algorithms.num347_TopKFrequentElements;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (fm.containsKey(nums[i])) fm.put(nums[i], fm.get(nums[i]) + 1);
        	else fm.put(nums[i], 1);
        }
        List<Integer> ls = new ArrayList<Integer>();
        
        for (int i = 0; i < k; i++) {
        	Iterator<Integer> it = fm.keySet().iterator();
        	int maxfv = -1, maxfk = -1;
        	while (it.hasNext()) {
        		int key = it.next();
        		if (fm.get(key) > maxfv) {
        			maxfv = fm.get(key);
        			maxfk = key;
        		}
        	}
        	ls.add(maxfk);
        	fm.remove(maxfk);
        }
        return ls;
    }
}
//20160618Sat15:37 duration:23m @github.com/BryanBo-Cao