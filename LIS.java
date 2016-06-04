package leetcode2;

/**
 *
 * @author dingwen
 * 300. Longest Increasing Subsequence
 * 
 */
public class LIS {
//{3,3,3,4,7,8,1,2,3,4} {2,2}
    public static void main(String[] args) {
        int[] nums = {1,3,6,7,9,4,10,5,6};
        LIS lis = new LIS();
        System.out.println(lis.lengthOfLIS(nums));
    }

/**
 * DP O(n*n) solution, easy to understand 
 * @param nums
 * @return 
 */
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] lisat = new int[length];
        lisat[0] = 1;

        for (int i = 1; i < length; i++) {
            if(nums[i] == nums[i - 1]) {
                lisat[i] = lisat[i - 1];
            } else {
                update(i, lisat, nums);
            }
        }

        int longest = 0;
        for (int j = 0; j < length; j++) {
            if (lisat[j] > longest) {
                longest = lisat[j];
            }
        }
        return longest;
    }

    private void update(int i, int[] lisat, int[] nums) {
        int t = i - 1;
        lisat[i] = 1;
        while (t >= 0) {
            if (nums[i] > nums[t] && lisat[i] <= lisat[t]) {
                lisat[i] = lisat[t] + 1;
            }
            t--;
        }
    }
    
    /**DP O(nlgn) solution
     *  dp[i] is the minimum value a subsequence of length i+1 might end with
     * @param nums
     * @return 
     */
     public int lengthOfLIS_faster(int[] nums) {            
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }

        return len;
    }
}
