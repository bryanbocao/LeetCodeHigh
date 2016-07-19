package test;

/**
 *
 * @author dingwen 
 * An accept solution (minSubArrayLen_origin) and simple solution(minSubArrayLen_simple) to Minimum Size Subarray Sum on Leetcode
 * Both the two method speeds are same.
 * 
 * for minSubArrayLen_origin, after adding nums[i]>nums[start] to if statement at line 50, minSubArrayLen_origin becomes faster than
 * it is added before by 1ms and passed. Otherwise, time limit exceeding
 */
public class MSSS {

    //1,2,3,4,5 11
    //10,2,3 6
    //2, 3, 1, 2, 4, 3 7
    public static void main(String[] args) {
        int[] nums = {10, 2, 3};
        MSSS mss = new MSSS();
        System.out.println(mss.minSubArrayLen(6, nums));
    }

    public int minSubArrayLen_simple(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum += nums[j++];

            while (sum >= s) {
                min = Math.min(min, j - i);
                sum -= nums[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public int minSubArrayLen_origin(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int start = 0;
        int sum = 0;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum >= s && nums[i]>nums[start]) {//move start index forward to the num to which the sum is exactaly larger or equal than s
                while (sum >= s) {
                    sum -= nums[start++];
                }
                sum += nums[--start];
                
            }
            
            if(sum >= s) {
                min = min < i - start + 1 ? min : i - start + 1;
            }

        }
        return sum >= s ? min : 0;
    }
    
}
