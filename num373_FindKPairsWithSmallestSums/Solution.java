/**
https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
373. Find K Pairs with Smallest Sums  QuestionEditorial Solution  My Submissions
Total Accepted: 3235 Total Submissions: 12992 Difficulty: Medium
You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.

Define a pair (u,v) which consists of one element from the first array and one element from the second array.

Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.

Example 1:
Given nums1 = [1,7,11], nums2 = [2,4,6],  k = 3

Return: [1,2],[1,4],[1,6]

The first 3 pairs are returned from the sequence:
[1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
Example 2:
Given nums1 = [1,1,2], nums2 = [1,2,3],  k = 2

Return: [1,1],[1,1]

The first 2 pairs are returned from the sequence:
[1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
Example 3:
Given nums1 = [1,2], nums2 = [3],  k = 3 

Return: [1,3],[2,3]

All possible pairs are returned from the sequence:
[1,3],[2,3]
 */
package algorithms.num373_FindKPairsWithSmallestSums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    	List<int[]> ls = new ArrayList<int[]>();
    	if (nums1.length != 0 && nums2.length != 0 && nums1.length + nums2.length > k) {
    		int i1 = 0, i2 = 0, i2from1 = 0, i1from2 = 0, lastSum = 0;
    		int[] pair;
    		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>(),
    				map2 = new HashMap<Integer, Integer>();
    		while (k > 0) {
    			pair = new int[2];
				if (map1.isEmpty() && map2.isEmpty()) {
					map1.put(i1, i2);
					map2.put(i2, i1);
					System.out.println("line 21");
				} else if (i1 + 1 > nums1.length) i2++;
				else if (i2 + 1 > nums2.length) i1++;
				else {
					System.out.println("line 25");
					int sum1 = nums1[i1] + nums2[map1.get(i1) + 1];
					int sum2 = nums2[i2] + nums1[map2.get(i2) + 1];
					if (sum1 <= sum2) {
						map1.put(i1, map1.get(i1) + 1);
						map2.put(map1.get(i1) + 1, 0);
						pair[0] = nums1[i1];
						pair[1] = nums2[map1.get(i1) + 1];
					} else {
						map2.put(i2, map2.get(i2) + 1);
						map1.put(map2.get(i2) + 1, 0);
						pair[0] = nums1[map2.get(i2) + 1];
						pair[1] = nums2[i2];
					}
					ls.add(pair);
					k--;
					continue;
				}
    			pair[0] = nums1[i1];
				pair[1] = nums2[i2];
				ls.add(pair);
    			k--;
    		}
    	}
    	return ls;
    }
}
//20160714Thu15:57 duration:1h01m24s55 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao

