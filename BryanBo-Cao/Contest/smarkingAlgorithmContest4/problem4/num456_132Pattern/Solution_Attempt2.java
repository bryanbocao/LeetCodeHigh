package smarkingAlgorithmContest4.problem4.num456_132Pattern;

public class Solution_Attempt2 {
    public boolean find132pattern(int[] nums) {
        if (nums.length > 0) {
            int minI = 0, maxI = 0, preI = 0;
            for (int i = 1; i < nums.length; i++) {
            	if (nums[minI] < nums[i] && nums[maxI] > nums[i] && minI < maxI) return true;
            	if (nums[minI] > nums[i]) minI = i;
            	if (nums[maxI] < nums[i]) maxI = i;
            	preI = i;
            }
        }
        return false;
    }
}

//[2,4,1,3] WrongAnswer