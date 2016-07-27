package algorithms.num001_TwoSum;

public class SolutionBefore20160726Tue2324 {

    public int[] twoSum(int[] nums, int target) {
    	int sum;
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
        		sum = nums[i] + nums[j];
        		if (sum > target) {
        			break;
        		} else if (sum == target) {
        			int[] returnA = new int[2];
        			returnA[0] = i;
        			returnA[1] = j;
        			return returnA;
        		}
        	}
        }
        return null;
    }

}
