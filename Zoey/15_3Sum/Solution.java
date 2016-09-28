public class Solution {

    private List<List<Integer>> res;
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        res = new LinkedList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            int item = -nums[i];
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
                twosum(nums, item, i);
        }
        return res;
    }

    public void twosum(int[] nums, int item, int ind){
        int lo=ind+1, hi=nums.length-1;
        while(lo<hi){
            if(nums[lo]+nums[hi]<item) lo++;
            else if(nums[lo]+nums[hi]>item) hi--;
            else{
                res.add(Arrays.asList(-item, nums[lo], nums[hi]));
                while(lo<hi && nums[lo]==nums[lo+1]) lo++;
                while(lo<hi && nums[hi]==nums[hi-1]) hi--;
                lo++;hi--;
            }
        }
    }
}