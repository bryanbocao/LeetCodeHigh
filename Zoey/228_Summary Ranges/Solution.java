public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if(nums==null||nums.length==0) return res;
        helper(res,nums);
        return res;
    }

    public void helper(List<String> list,int[] nums){
        int start=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                list.add(getRange(start,nums[i-1]));
                start=nums[i];
            }
        }
        if(start==nums[nums.length-1]) list.add(Integer.toString(start));
        else list.add(getRange(start,nums[nums.length-1]));
    }

    public String getRange(int start,int end){
        if(start>=end) return Integer.toString(start);
        return Integer.toString(start)+"->"+Integer.toString(end);
    }
}