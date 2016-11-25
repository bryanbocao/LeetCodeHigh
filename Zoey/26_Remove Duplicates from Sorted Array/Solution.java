public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        //[1]这种情况 所以INDEX=1
        int index=1;
        for(int i=1;i<nums.length;i++){
            //注意这里的手法 其实也没什么
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}