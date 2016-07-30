public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2) return nums.length;
        int res = 1;
        boolean decrease = nums[0]>=nums[1];
        for(int i=1;i<nums.length;i++){
            if(decrease){
                if(nums[i-1]>nums[i]){
                    decrease=!decrease;
                    res++;
                }
            }else{
                if(nums[i-1]<nums[i]){
                    decrease=!decrease;
                    res++;
                }
            }
        }
        return res;
    }
}