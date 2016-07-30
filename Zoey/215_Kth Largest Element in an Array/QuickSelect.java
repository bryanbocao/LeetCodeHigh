public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null || nums.length==0) return Integer.MAX_VALUE;
        return findKthLargest(nums,0,nums.length-1,nums.length-k);
    }

    public int findKthLargest(int[] nums, int start, int end, int k){
        if(start>end) return Integer.MAX_VALUE;
        int left=start;
        int pivot=nums[end];
        for(int i=start;i<end;i++){
            if(nums[i]<=pivot) swap(nums,left++,i);
        }
        swap(nums,left,end);

        if(left==k) return nums[left];
        if(left<k) return findKthLargest(nums,left+1,end,k);
        else return findKthLargest(nums,start,left-1,k);
    }

    public void swap(int[] nums,int a, int b){
        int tmp = nums[a];
        nums[a]=nums[b];
        nums[b]=tmp;
    }
}

//For details: https://discuss.leetcode.com/topic/29537/concise-java-solution-based-on-quick-select/2