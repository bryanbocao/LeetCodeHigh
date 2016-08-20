public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<String>();
        if(nums==null || nums.length==0){
            res.add(getRange(lower,upper));
            return res;
        }
        int counter=lower;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<counter) continue;

            if(nums[i]==counter){
                counter++;
                continue;
            }

            res.add(getRange(counter,nums[i]-1));
            counter=nums[i]+1;
        }
        if(counter<=upper) res.add(getRange(counter,upper));
        return res;
    }

    public String getRange(int start, int end){
        if(start==end) return Integer.toString(start);
        return Integer.toString(start)+"->"+Integer.toString(end);
    }
}