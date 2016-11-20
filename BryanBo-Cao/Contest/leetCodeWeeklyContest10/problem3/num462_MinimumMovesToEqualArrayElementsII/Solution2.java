package leetCodeWeeklyContest10.problem3.num462_MinimumMovesToEqualArrayElementsII;

import java.util.Arrays;

public class Solution2 {
    public int minMoves2(int[] nums) {
        if (nums.length > 0) {
        	int moves = 0;
        	Arrays.sort(nums);
        	while (nums[0] != nums[nums.length - 1]) {
        		for (int i = 0; i < nums.length; i++) System.out.print(nums[i] + " ");
        		System.out.println();
        		nums[nums.length - 1]--;
        		moves++;
        		if (nums[0] == nums[nums.length - 1]) Arrays.sort(nums);
        		
        	}
        	return moves;
        }
        return 0;
    }
}
/*
Input:
[1,0,0,8,6]
Output:
8
Expected:
14
*/