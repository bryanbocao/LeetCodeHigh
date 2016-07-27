package algorithms.num169_MajorityElement;

import java.util.*;

public class Solution20160613Mon0920 {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maj = (int) Math.floor(nums.length / 2);
        for (int i = 0; i < nums.length; i++) {
        	if (map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
        	else map.put(nums[i], 1);
        	if (map.get(nums[i]) > maj) return nums[i];
        }
        return 0;
    }
}
