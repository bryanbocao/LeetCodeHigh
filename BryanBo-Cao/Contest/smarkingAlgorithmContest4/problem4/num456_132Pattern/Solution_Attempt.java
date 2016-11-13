package smarkingAlgorithmContest4.problem4.num456_132Pattern;

public class Solution_Attempt {
    public boolean find132pattern(int[] nums) {
        if (nums.length > 0) {
            int min = nums[0], max = nums[0], pre = nums[0];
            for (int i = 1; i < nums.length; i++) {
            	if (pre < nums[i]) { // going up
            		if (max < nums[i]) max = nums[i];
            	} else if (pre > nums[i]){ // going down
            		if (min < nums[i]) {
            			if (max > nums[i] && max > min) return true;
            		} else if (min > nums[i]) min = nums[i];
            	}
            	pre = nums[i];
            }
        }
        return false;
    }
}

//[-2,1,2,-2,1,2] WrongAnswer