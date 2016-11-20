public class Solution {
    public int minMoves2(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        Arrays.sort(nums);
        int mid = nums.length/2;
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=(Math.abs(nums[i]-nums[mid]));
        }
        return res;
    }
}