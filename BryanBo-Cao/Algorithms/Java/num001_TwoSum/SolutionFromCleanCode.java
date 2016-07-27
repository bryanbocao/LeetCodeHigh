package algorithms.num001_TwoSum;

import java.util.HashMap;


public class SolutionFromCleanCode {
	
	//10 20160509Mon
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		iMap.put(nums[0], 0);
		for (int i = 0; i < nums.length; i++) {
			int remain = target - nums[i];
			if (iMap.containsKey(remain)) {
				return new int[]{iMap.get(remain), i};
			} else {
				iMap.put(remain, i);
			}
		}
		return null;
	}

}
