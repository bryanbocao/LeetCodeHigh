public class Solution {

    private Deque<Integer> queue;
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || nums.length==0) return new int[0];
        queue = new ArrayDeque<Integer>();
        for(int i=0;i<=nums.length-k;i++){
            queue.offer(windowMax(nums,i,i+k-1));
        }
        int[] res = new int[queue.size()];
        int ind=0;
        while(!queue.isEmpty()){
            res[ind]=queue.poll();
            ind++;
        }
        return res;
    }

    public int windowMax(int[] nums, int s, int e){
        int res=Integer.MIN_VALUE;
        while(s<=e){
            res = Math.max(res,nums[s]);
            s++;
        }
        return res;
    }
}