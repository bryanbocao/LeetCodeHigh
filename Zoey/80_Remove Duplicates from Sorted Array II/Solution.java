public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int index=1;
        //除了counter 都是一样的套路
        int counter = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                //处理第二个重复
                if(counter<1){
                    nums[index]=nums[i];
                    index++;
                }
                counter++;
            }else{
                nums[index]=nums[i];
                index++;
                //手段和处理第二个重复一样 另外需要重置COUNTER
                counter=0;
            }
        }
        return index;
    }
}