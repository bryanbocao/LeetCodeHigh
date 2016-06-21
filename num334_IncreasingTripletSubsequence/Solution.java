/**
https://leetcode.com/problems/increasing-triplet-subsequence/
334. Increasing Triplet Subsequence My Submissions QuestionEditorial Solution
Total Accepted: 16512 Total Submissions: 47817 Difficulty: Medium
Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

Formally the function should:
Return true if there exists i, j, k 
such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
Your algorithm should run in O(n) time complexity and O(1) space complexity.

Examples:
Given [1, 2, 3, 4, 5],
return true.

Given [5, 4, 3, 2, 1],
return false.
 */
package algorithms.num334_IncreasingTripletSubsequence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        List<Integer> prels = new ArrayList<Integer>(),
        		upls = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
        	Iterator<Integer> uplsit = upls.iterator();
        	while (uplsit.hasNext()) if (nums[i] > uplsit.next()) return true;
        	Iterator<Integer> pit = prels.iterator();
        	while (pit.hasNext()) if (nums[i] > pit.next()) upls.add(nums[i]);
        	prels.add(nums[i]);
        }
        return false;
    }
}
//https://leetcode.com/problems/increasing-triplet-subsequence/
//20160621Tue13:18 duration:44m36s04 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao
