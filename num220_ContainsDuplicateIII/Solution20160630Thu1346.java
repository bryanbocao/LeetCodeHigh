package algorithms.num220_ContainsDuplicateIII;

import java.util.Arrays;

public class Solution20160630Thu1346 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
        		if (Math.abs((long)nums[j] - (long)nums[i]) <= t && j - i <= k) return true;
        	}
        }
        return false;
    }
}
//20160630Thu13:46 duration:7m19s36 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao