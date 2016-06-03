/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode2;

/**
 *
 * @author dingwen
 * Longest Increasing Subsequence
 * DP O(n*n) solution, easy to understand 
 */
public class LIS {
//{3,3,3,4,7,8,1,2,3,4} {2,2}
    public static void main(String[] args) {
        int[] nums = {1,3,6,7,9,4,10,5,6};
        LIS lis = new LIS();
        System.out.println(lis.lengthOfLIS(nums));
    }

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
}
