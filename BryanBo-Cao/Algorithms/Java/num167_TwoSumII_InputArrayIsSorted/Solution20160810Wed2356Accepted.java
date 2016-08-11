/**
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
Locked Question
 */
package algorithms.num167_TwoSumII_InputArrayIsSorted;

import java.util.HashMap;
import java.util.Map;

public class Solution20160810Wed2356Accepted {
    public int[] twoSum(int[] numbers, int target) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < numbers.length; i++) {
    		if (map.containsKey(target - numbers[i])) return new int[]{map.get(target - numbers[i]) + 1, i + 1};
    		else map.put(numbers[i], i);
    	}
    	return null;
    }
}
//20160810Wed23:56 CodingDuration:7m13s40 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
